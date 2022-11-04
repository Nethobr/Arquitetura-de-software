package br.edu.up;

import br.edu.up.cores.Branco;
import br.edu.up.estampas.Caveira;
import br.edu.up.marcas.Adidas;
import br.edu.up.roupas.Camisa;

public class GuardaRoupas {
	public static void main(String[] args) {
		RoupaAbstrata camisa = 
				new Camisa(
					new Branco(),				//	Cor
					new Adidas(), 				// Marca
					new Caveira(), 				// Estampa
					"GG", 						// Tamanho
					new ImplementarRoupa());	// Implementador da roupa
		//	Criando a roupa.
		camisa.criarRoupa();
	}
}