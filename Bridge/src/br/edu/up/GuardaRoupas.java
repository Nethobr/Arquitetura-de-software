package br.edu.up;

import br.edu.up.cores.Verde;
import br.edu.up.cores.Vermelha;
import br.edu.up.roupas.Camisa;
import br.edu.up.roupas.Cueca;

public class GuardaRoupas {

	public static void main(String[] args) {
		
		//	Criando uma camisa
		RoupaAbstrata camisaVerde = 
				new Camisa(new Verde(), "GG");
		camisaVerde.criarRoupa();
		
		System.out.println();
		
		//	Criando um cuequinha melada
		RoupaAbstrata cueca = 
				new Cueca(new Verde(), "GG");
		cueca.criarRoupa();
		
		System.out.println();
		
		//	Criando um camisa vermelha
		RoupaAbstrata camisaVermelha =
				new Camisa(new Vermelha(), "G");
		camisaVermelha.criarRoupa();
	}
}