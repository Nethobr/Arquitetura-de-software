package br.edu.up;

import br.edu.up.cores.Branco;
import br.edu.up.cores.Verde;
import br.edu.up.cores.Vermelho;
import br.edu.up.marcas.Adidas;
import br.edu.up.marcas.Nike;
import br.edu.up.roupas.Camisa;
import br.edu.up.roupas.Cueca;

public class GuardaRoupas {

	public static void main(String[] args) {
		
		//	Criando uma camisa
		RoupaAbstrata camisaVerde = 
				new Camisa(new Verde(), new Nike(), "GG");
		camisaVerde.criarRoupa();
		
		System.out.println();
		
		//	Criando uma cueda melada da adidas
		RoupaAbstrata cucecaMelada =
				new Cueca(new Vermelho(), new Adidas(), "GG");
		cucecaMelada.criarRoupa();
		
		System.out.println();
		
		//	Criando uma camisa da adidas
		RoupaAbstrata camisaAdidas =
				new Camisa(new Branco(), new Adidas(), "GG");
		camisaAdidas.criarRoupa();
	}
}