package br.up.edu.MicroServiceDecorator;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
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

@Controller
public class Home 
{
	//	Alocando um lugar na memória para salvar os cafés.
	ArrayList<CoffeModel> coffesModel = new ArrayList<CoffeModel> ();

	public void cafesModel()
	{
		Coffe coffe = new BasicCoffe();

		coffe 		= new LeiteDecorator(coffe);
		coffesModel.add(new CoffeAdapter(coffe).toCoffeModel());

		coffe 		= new SorveteDecorator(coffe);
		coffesModel.add(new CoffeAdapter(coffe).toCoffeModel());

		coffe 		= new RemoveDecorator(coffe, new LeiteDecorator());
		coffe		= new CanelaDecorator(coffe);
		coffesModel.add(new CoffeAdapter(coffe).toCoffeModel());
	}	//	Gambiarra

	//	Retorna um café.
	@GetMapping("coffe")
	public ResponseEntity<CoffeModel> coffe () 
	{
		Coffe 	cafe = new BasicCoffe();
				cafe = new LeiteDecorator(cafe);
				cafe = new CanelaDecorator(cafe);
				cafe = new SorveteDecorator(cafe);
				cafe = new RemoveDecorator(cafe, new SorveteDecorator());

		return 	new ResponseEntity<CoffeModel>(
				new CoffeAdapter(cafe).toCoffeModel(),
				HttpStatus.OK
		);
	}

	//	Retornando toda a lista de cafés adicionados.
	@GetMapping("coffes")
	public ResponseEntity<ArrayList<CoffeModel>> coffes ()
	{
		// cafesModel();
		return new ResponseEntity<ArrayList<CoffeModel>>(coffesModel, HttpStatus.OK);
	}

	//	Enviando(post) de um café.
	@PostMapping("coffe")
	public ResponseEntity<CoffeModel> addCoffe (@RequestBody String coffeBody)
	{
		Coffe coffe = new BasicCoffe();

		if (coffeBody.contains("Leite")) coffe 	= new LeiteDecorator(coffe);
		if (coffeBody.contains("Canela")) coffe 	= new CanelaDecorator(coffe);
		if (coffeBody.contains("Sorvete")) coffe	= new SorveteDecorator(coffe);

		CoffeModel coffeFinal =  new CoffeAdapter(coffe).toCoffeModel();

		coffesModel.add(coffeFinal);
		return new ResponseEntity<CoffeModel>(coffeFinal, HttpStatus.OK);
	}

	//	Atualizando um café
	@PutMapping("coffe/{produto}")
	public ResponseEntity<CoffeModel> updateCoffe (@RequestBody CoffeModel coffeBody, @PathVariable String produto)
	{
		//	TODO
		return null;
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