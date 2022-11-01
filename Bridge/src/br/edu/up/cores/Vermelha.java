package br.edu.up.cores;

import br.edu.up.RoupaImplementation;

public class Vermelha implements RoupaImplementation
{
	@Override
	public void setRoupa(String roupa) {
		System.out.println(roupa + "\n");
		System.out.println("Cor: Vermelha");
	}

	@Override
	public void setTamanho(String tam) {
		System.out.println("Tamanho: " + tam + ".");
	}

	@Override
	public void setCor() {
		System.out.println("Cor: Vermelha.");
	}
}
