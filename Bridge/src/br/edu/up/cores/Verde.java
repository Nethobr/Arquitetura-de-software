package br.edu.up.cores;

import br.edu.up.RoupaImplementation;

public class Verde implements RoupaImplementation
{
	@Override
	public void setRoupa(String roupa) {
		System.out.println(roupa);
	}

	@Override
	public void setTamanho(String tam) {
		System.out.println("Tamanho: " + tam + ".");
	}
	
	@Override
	public void setCor() {
		System.out.println("Cor: Verde.");
	}
}