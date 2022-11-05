package br.edu.up;

import br.edu.up.cores.Branco;
import br.edu.up.cores.Vermelho;
import br.edu.up.estampas.Caveira;
import br.edu.up.estampas.Vazia;
import br.edu.up.marcas.Adidas;
import br.edu.up.marcas.ImplementarMarca;
import br.edu.up.marcas.Lacoste;
import br.edu.up.roupas.Camisa;
import br.edu.up.roupas.Cueca;
import br.edu.up.roupas.ImplementarRoupa;

public class GuardaRoupas {
	public static void main(String[] args) {
		
		//	Uma Camisa
		RoupaAbstrata camisa = 
				new Camisa( new Branco(),			//	Cor.
							new ImplementarMarca(	//	Implementando				
									new Adidas()), 	// 	a marca.
							new Caveira (),			//	Estampa.
							"GG", 					//	Tamanho
							new ImplementarRoupa());// Implementando a roupa.
		//	Criando a roupa:
		camisa.criarRoupa();
		
		//	Uma Cueca
		RoupaAbstrata cueca =
				new Cueca(	new Vermelho(), 
							new ImplementarMarca(
								new Lacoste()), 
							new Vazia(),
							"GGG",
							new ImplementarRoupa());
		//	Criando a cueca:
		cueca.criarRoupa();
	}
}