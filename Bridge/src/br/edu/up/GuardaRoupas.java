package br.edu.up;

import br.edu.up.abstracoes.RoupaAbstrata;
import br.edu.up.cores.Branco;
import br.edu.up.cores.Cor;
import br.edu.up.cores.Vermelho;
import br.edu.up.estampas.Caveira;
import br.edu.up.estampas.Estampa;
import br.edu.up.estampas.Moranguinho;
import br.edu.up.estampas.Vazia;
import br.edu.up.marcas.Adidas;
import br.edu.up.marcas.Marca;
import br.edu.up.marcas.Nenhuma;
import br.edu.up.marcas.Nike;
import br.edu.up.marcas.Rosa;
import br.edu.up.marcas.Lacoste;
import br.edu.up.roupas.Camisa;
import br.edu.up.roupas.Cueca;
import br.edu.up.roupas.ImplementarRoupa;
import br.edu.up.tamanho.GG;
import br.edu.up.tamanho.Numero;
import br.edu.up.tamanho.P;
import br.edu.up.tamanho.Tamanho;

public class GuardaRoupas {
	public static void main(String[] args) {
		
		//	Uma Camisa
		RoupaAbstrata camisa = 
<<<<<<< HEAD
				new Camisa( new Cor(	new Branco()),		//	Cor.
							new Marca(	new Adidas()),		// 	a marca.
							new Estampa(new Caveira ()),	//	Estampa.
							new Tamanho(new GG()), 			//	Tamanho
							new ImplementarRoupa());		// Implementando a roupa.
=======
				new Camisa(	new Cor(	new Branco()),		//	Cor.
						new Marca(	new Adidas()),		// 	a marca.
						new Estampa(	new Caveira ()),	//	Estampa.
						"GG", 					//	Tamanho
						new ImplementarRoupa());		//	Implementando a roupa.
>>>>>>> 51ebedbbd18cac5cd58be1c94bdf361483810447
		//	Criando a roupa:
		camisa.criarRoupa();
		
		System.out.println();
		
<<<<<<< HEAD
		//	Roupa linda da moranguinho
		RoupaAbstrata moranguinhoFashion =
				new Camisa(	new Cor(new Rosa()), 
							new Marca(new Nenhuma()), 
							new Estampa(new Moranguinho()), 
							new Tamanho(new P()), 
							new ImplementarRoupa());
		moranguinhoFashion.criarRoupa();
		
		
		System.out.println();
		
		RoupaAbstrata camisaVermelha =
				new	Camisa(	new Cor(new Vermelho()),
							new Marca(new Nike()),
							new	Estampa(new Vazia()),
							new	Tamanho(new Numero(39)),
							new ImplementarRoupa()
							);
		camisaVermelha.criarRoupa();
=======
		//	Uma Cueca
		RoupaAbstrata cueca =
				new Cueca(	new Cor(	new Vermelho()), 
						new Marca(	new Lacoste()), 
						new Estampa(	new Vazia()),
						"GGG",
						new ImplementarRoupa());
		//	Criando a cueca:
		cueca.criarRoupa();
>>>>>>> 51ebedbbd18cac5cd58be1c94bdf361483810447
	}
}
