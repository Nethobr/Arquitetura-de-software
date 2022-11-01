package br.edu.up;

import br.edu.up.cores.Verde;
import br.edu.up.cores.Vermelha;
import br.edu.up.roupas.Camisa;
import br.edu.up.roupas.Cueca;

public class GuardaRoupas {

	public static void main(String[] args) {
		
		//	Criando uma camisa
		RoupaAbstrata camisa = 
				new Camisa(new Verde(), "GG");
		camisa.criarRoupa();
		
		System.out.println();
		
		//	Criando uma cueca melada
		RoupaAbstrata cuecaMelada = 
				new Cueca(new Vermelha(), "GG");
		cuecaMelada.criarRoupa();
	}
}