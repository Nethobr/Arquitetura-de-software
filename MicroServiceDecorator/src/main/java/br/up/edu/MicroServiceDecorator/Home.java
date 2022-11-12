package br.up.edu.MicroServiceDecorator;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
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
	ArrayList<CoffeModel> coffesModel = new ArrayList<CoffeModel> ();
	int UID = 0;

	//	Retorna um café do array de acordo com id.
	public CoffeModel getCoffeModel(int id)
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
	public int getIndexOfCoffe(int id)
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
	public Coffe coffeBodyString(String string)
	{
		Coffe coffe = new BasicCoffe();

		String upperCoffe = string.toUpperCase();
		if (upperCoffe.contains("LEITE")) coffe 		= new LeiteDecorator(coffe);
		if (upperCoffe.contains("CANELA")) coffe 	= new CanelaDecorator(coffe);
		if (upperCoffe.contains("SORVETE")) coffe	= new SorveteDecorator(coffe);

		return coffe;
	}	//	removeString

	//	Remove decoradores
	public Coffe coffeBodyRemoveString(String string)
	{
		Coffe coffe = new BasicCoffe();

		String upperCoffe = string.toUpperCase();
		if (upperCoffe.contains("LEITE")) coffe 		= new RemoveDecorator(coffe, new LeiteDecorator());
		if (upperCoffe.contains("CANELA")) coffe 	= new RemoveDecorator(coffe, new CanelaDecorator());
		if (upperCoffe.contains("SORVETE")) coffe	= new RemoveDecorator(coffe, new SorveteDecorator());
		
		return coffe;
	}	//	coffeBodyRemoveString

	//	Retorna um café de acordo com id.
	@GetMapping("coffe/{id}")
	public ResponseEntity<CoffeModel> coffe (
		@RequestBody CoffeModel coffeModel,
		@PathVariable int id) {

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
		Coffe coffe = coffeBodyString(coffeBody);

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
		CoffeModel newCoffe = new CoffeModel();
		int idCOffe = getIndexOfCoffe(id);

		//	Ataulizando
		newCoffe.setId(id);
		newCoffe.setPreco(coffeBody.getPreco());
		newCoffe.setProduto(coffeBody.getProduto());
		coffesModel.set(idCOffe, newCoffe);

		return new ResponseEntity<CoffeModel>(
			newCoffe, 
			HttpStatus.OK);
	}	//	updateCoffe

	//	Home.
	@GetMapping("/")
	public @ResponseBody String mensagem ()
	{
		return "Olá!" +
				"<br/>" +
				"Bem vindo ao nosso micro-serviço!";
	}
}