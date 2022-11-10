package br.up.edu.MicroServiceDecorator;

import java.lang.reflect.Array;
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
import br.up.edu.MicroServiceDecorator.decorator.SorveteDecorator;
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

	ArrayList<String> coffes = new ArrayList<String>();

	public void cafes()
	{
		Coffe coffe = new BasicCoffe();
		coffe = new LeiteDecorator(coffe);
		coffes.add(new CoffeAdapterJson(coffe).toString());
		coffe = new SorveteDecorator(coffe);
		coffes.add(new CoffeAdapterJson(coffe).toString());
		coffe = new RemoveDecorator(coffe, new LeiteDecorator());
		coffe = new CanelaDecorator(coffe);
		coffes.add(new CoffeAdapterJson(coffe).toString());
	}

	@GetMapping("coffes")
	public @ResponseBody String coffes()
	{
		cafes();
		String tudo = "[\n";
		for (String string : coffes) {
			tudo += "" + string + ",\n";
		}

		tudo.substring(0, tudo.length() - 2);

		return tudo + "	\n]";
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