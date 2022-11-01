package br.edu.up.cores;

import br.edu.up.RoupaImplementation;

public class Vermelho implements RoupaImplementation
{
	@Override
	public void setRoupa(String roupa) {
		System.out.println(roupa);
	}
	
	@Override
	public void setMarca(String marca) {
		System.out.println("Marca: " + marca + ".");
	}
	
	@Override
	public void setTamanho(String tam) {
		System.out.println("Tamanho: " + tam + ".");
	}
	
	@Override
	public void setCor() {
		System.out.println("Cor: Vermelho.");
	}
}
