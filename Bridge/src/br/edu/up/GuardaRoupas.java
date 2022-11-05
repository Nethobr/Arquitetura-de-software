package br.edu.up;

import br.edu.up.cores.Branco;
import br.edu.up.cores.Cor;
import br.edu.up.cores.Vermelho;
import br.edu.up.estampas.Caveira;
import br.edu.up.estampas.Estampa;
import br.edu.up.estampas.Vazia;
import br.edu.up.marcas.Adidas;
import br.edu.up.marcas.Marca;
import br.edu.up.marcas.Lacoste;
import br.edu.up.roupas.Camisa;
import br.edu.up.roupas.Cueca;
import br.edu.up.roupas.ImplementarRoupa;

public class GuardaRoupas {
	public static void main(String[] args) {
		
		//	Uma Camisa
		RoupaAbstrata camisa = 
				new Camisa(	new Cor(	new Branco()),		//	Cor.
						new Marca(	new Adidas()),		// 	a marca.
						new Estampa(	new Caveira ()),	//	Estampa.
						"GG", 					//	Tamanho
						new ImplementarRoupa());		//	Implementando a roupa.
		//	Criando a roupa:
		camisa.criarRoupa();
		
		System.out.println();
		
		//	Uma Cueca
		RoupaAbstrata cueca =
				new Cueca(	new Cor(	new Vermelho()), 
						new Marca(	new Lacoste()), 
						new Estampa(	new Vazia()),
						"GGG",
						new ImplementarRoupa());
		//	Criando a cueca:
		cueca.criarRoupa();
	}
}
