package br.up.edu.MicroServiceDecorator;

import java.util.ArrayList;

//	Bibliotecas
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//	Projeto
import br.up.edu.MicroServiceDecorator.adapter.CoffeAdapterJson;
import br.up.edu.MicroServiceDecorator.decorator.CanelaDecorator;
import br.up.edu.MicroServiceDecorator.decorator.LeiteDecorator;
import br.up.edu.MicroServiceDecorator.decorator.RemoveDecorator;
import br.up.edu.MicroServiceDecorator.domain.BasicCoffe;
import br.up.edu.MicroServiceDecorator.domain.Coffe;

@Controller
public class Home 
{
	@GetMapping("coffe")
	public @ResponseBody String coffe() 
	{
		Coffe 	cafe = new BasicCoffe();
				cafe = new LeiteDecorator(cafe);
				cafe = new CanelaDecorator(cafe);
				cafe = new RemoveDecorator(cafe, new LeiteDecorator());

		return new CoffeAdapterJson(cafe).toString();
	}

	ArrayList<String> coffes = new ArrayList<>();
	@PostMapping("coffe")
	public @ResponseBody String addCoffe(String coffe)
	{
		coffes.add(coffe);
		return coffe;
	}

	@GetMapping("coffes")
	public @ResponseBody ArrayList<String> coffes()
	{
		ArrayList<String> coffesString = new ArrayList<>();
		for (String coffe : coffes) 
		{
			coffesString.add(coffe);
		}
		return coffesString; 
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