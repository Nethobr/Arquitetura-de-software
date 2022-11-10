package br.up.edu.MicroServiceDecorator;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//	Bibliotecas
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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
	@GetMapping("coffe")
	public ResponseEntity<CoffeModel> coffeModel() 
	{
		Coffe 	cafe = new BasicCoffe();
				cafe = new LeiteDecorator(cafe);
				cafe = new CanelaDecorator(cafe);
				cafe = new RemoveDecorator(cafe, new LeiteDecorator());

		return 	new ResponseEntity<CoffeModel>(
				new CoffeAdapter(cafe).toCoffeModel(),
				HttpStatus.OK
		);
	}

	ArrayList<CoffeModel> coffesModel = new ArrayList<CoffeModel>();
	public void cafesModel()
	{
		Coffe coffe = new BasicCoffe();
		coffe = new LeiteDecorator(coffe);
		coffesModel.add(new CoffeAdapter(coffe).toCoffeModel());
		coffe = new SorveteDecorator(coffe);
		coffesModel.add(new CoffeAdapter(coffe).toCoffeModel());
		coffe = new RemoveDecorator(coffe, new LeiteDecorator());
		coffe = new CanelaDecorator(coffe);
		coffesModel.add(new CoffeAdapter(coffe).toCoffeModel());
	}

	@GetMapping("coffes")
	public ResponseEntity<ArrayList<CoffeModel>> aEntity ()
	{
		cafesModel();
		return new ResponseEntity<ArrayList<CoffeModel>>(coffesModel, HttpStatus.OK);
	}

	@GetMapping("/")
	public @ResponseBody String mensagem()
	{
		return "Olá!" +
				"<br/>" +
				"Bem vindo ao nosso micro-serviço!";
	}

	@GetMapping("/error")
	public @ResponseBody String error()
	{
		return "Olá!" +
				"<br/>" +
				"Ocorreu um erro!.";
	}
}	//	Home