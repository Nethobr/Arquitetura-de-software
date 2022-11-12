package br.up.edu.MicroServiceDecorator;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

//	Projeto
import br.up.edu.MicroServiceDecorator.adapter.CoffeAdapter;
import br.up.edu.MicroServiceDecorator.decorator.CanelaDecorator;
import br.up.edu.MicroServiceDecorator.decorator.LeiteDecorator;
import br.up.edu.MicroServiceDecorator.decorator.RemoveDecorator;
import br.up.edu.MicroServiceDecorator.decorator.SorveteDecorator;
import br.up.edu.MicroServiceDecorator.domain.BasicCoffe;
import br.up.edu.MicroServiceDecorator.domain.Coffe;
import br.up.edu.MicroServiceDecorator.models.CoffeModel;

@CrossOrigin(origins = "*")
@Controller
public class Home 
{
	//	Alocando um lugar na memória para salvar os cafés.
	protected ArrayList<CoffeModel> coffesModel = new ArrayList<CoffeModel> ();
	protected int UID = 0;

	//	Retorna um café do array de acordo com id.
	protected CoffeModel getCoffeModel(int id)
	{
		CoffeModel finalCoffe = new CoffeModel();
		for(CoffeModel coffe: coffesModel)
		{
			if(coffe.getId() == id)
				finalCoffe = coffesModel.get(id);
		}
		return finalCoffe;
	}	//	getCoffeModel

	//	Pega o index do café no array.
	protected int getIndexOfCoffe(int id)
	{
		int idCOffe = 0;
		for(CoffeModel coffe: coffesModel)
		{
			if(coffe.getId() == id)
				idCOffe =  coffesModel.indexOf(coffe);
		}
		return idCOffe;
	}	//	getIndexOfCoffe

	//	Adiciona decoradores
	protected Coffe coffeBodyString(String string, Coffe coffe)
	{
		String upperCoffe = string.toUpperCase();
		if (upperCoffe.contains("LEITE")) coffe 	= new LeiteDecorator(coffe);
		if (upperCoffe.contains("CANELA")) coffe 	= new CanelaDecorator(coffe);
		if (upperCoffe.contains("SORVETE")) coffe	= new SorveteDecorator(coffe);

		return coffe;
	}	//	coffeBodyString

	//	Adiciona decoradores
	protected Coffe coffeBodyRemoveString(String string, Coffe coffe)
	{
		String upperCoffe = string.toUpperCase();
		if (upperCoffe.contains("LEITE")) coffe 	= new RemoveDecorator(coffe, new LeiteDecorator());
		if (upperCoffe.contains("CANELA")) coffe 	= new RemoveDecorator(coffe, new CanelaDecorator());
		if (upperCoffe.contains("SORVETE")) coffe	= new RemoveDecorator(coffe, new SorveteDecorator());
		return coffe;
	}	//	coffeBodyRemoveString

	//	Atulizar a lista
	protected CoffeModel updateCoffeList(int id, CoffeModel coffeBody)
	{
		CoffeModel newCoffe = new CoffeModel();
		int idCOffe = getIndexOfCoffe(id);

		//	Ataulizando
		newCoffe.setId(id);
		newCoffe.setPreco(coffeBody.getPreco());
		newCoffe.setProduto(coffeBody.getProduto());
		coffesModel.set(idCOffe, newCoffe);

		return newCoffe;
	}	//	updateCoffeList

	//	Retorna um café de acordo com id.
	@GetMapping("coffe/{id}")
	public ResponseEntity<CoffeModel> coffe (@PathVariable int id) 
	{
		CoffeModel coffe = getCoffeModel(id);

		return new ResponseEntity<CoffeModel>(
			coffe,
			HttpStatus.OK
		);
	}

	//	Retornando toda a lista de cafés adicionados.
	@GetMapping("coffes")
	public ResponseEntity<ArrayList<CoffeModel>> coffes ()
	{
		return new ResponseEntity<ArrayList<CoffeModel>>(
			coffesModel, 
			HttpStatus.OK);
	}

	//	Enviando(post) de um café.
	@PostMapping("coffe")
	public ResponseEntity<CoffeModel> addCoffe (@RequestBody String coffeBody)
	{
		Coffe coffe = coffeBodyString(coffeBody, new BasicCoffe());

		//	Salvando o café na lista
		CoffeModel coffeFinal =  new CoffeAdapter(coffe).toCoffeModel();
		coffeFinal.setId(UID);
		UID ++;
		coffesModel.add(coffeFinal);

		//	Retornando um respota do que foi salvo
		return new ResponseEntity<CoffeModel>(
			coffeFinal, 
			HttpStatus.OK);
	}

	//	Atualizando um café
	@PutMapping("coffe/{id}")
	public ResponseEntity<CoffeModel> updateCoffe (
		@RequestBody CoffeModel coffeBody, 
		@PathVariable int id) 
	{
		CoffeModel newCoffe = updateCoffeList(id, coffeBody);

		return new ResponseEntity<CoffeModel>(
			newCoffe, 
			HttpStatus.OK);
	}	//	updateCoffe

	//	Remove um decorador do café por texto
	@PutMapping("coffeRemoveDec/{id}")
	public ResponseEntity<CoffeModel> removeDecorator(
		@RequestBody String coffeBoddy,
		@PathVariable int id
	)
	{
		CoffeModel coffeModel = getCoffeModel(id);

		Coffe coffe = new CoffeAdapter(coffeModel).toCoffeImpl();
		coffe = coffeBodyRemoveString(coffeBoddy, coffe);

		// String upperCoffe = coffeBoddy.toUpperCase();
		// if (upperCoffe.contains("LEITE")) coffe 	= new RemoveDecorator(coffe, new LeiteDecorator());
		// if (upperCoffe.contains("CANELA")) coffe 	= new RemoveDecorator(coffe, new CanelaDecorator());
		// if (upperCoffe.contains("SORVETE")) coffe	= new RemoveDecorator(coffe, new SorveteDecorator());

		CoffeModel newCoffe =
			new CoffeAdapter(coffe).toCoffeModel();
		
		newCoffe = updateCoffeList(id, newCoffe);

		return new ResponseEntity<CoffeModel>(
			newCoffe, 
			HttpStatus.OK);
	}	//	removeDecorator

	//	Adiciona um decorador do café por texto
	@PutMapping("coffeAddDec/{id}")
	public ResponseEntity<CoffeModel> addDecorator(
		@RequestBody String coffeBoddy,
		@PathVariable int id
	)
	{
		CoffeModel coffeModel = getCoffeModel(id);

		Coffe coffe = new CoffeAdapter(coffeModel).toCoffeImpl();

		coffe = coffeBodyString(coffeBoddy, coffe);

		CoffeModel newCoffe =
			new CoffeAdapter(coffe).toCoffeModel();
		
		newCoffe = updateCoffeList(id, newCoffe);

		return new ResponseEntity<CoffeModel>(
			newCoffe, 
			HttpStatus.OK);
	}	//	addDecorator

	//	Remove um café
	@DeleteMapping("coffe/{id}")
	public ResponseEntity<CoffeModel> removeCoffe(
		@PathVariable int id)
	{
		CoffeModel coffe = getCoffeModel(id);

		coffesModel.remove(coffe);

		return new ResponseEntity<CoffeModel>(
			coffe, 
			HttpStatus.OK);
	}
	//	Home.
	@GetMapping("/")
	public @ResponseBody String mensagem ()
	{
		return "Olá!" +
				"<br/>" +
				"Bem vindo ao nosso micro-serviço!";
	}
}