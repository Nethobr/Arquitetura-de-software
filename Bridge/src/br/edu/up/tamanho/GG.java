package br.edu.up.tamanho;

import br.edu.up.interfaces.TamanhoImplementation;

public class GG implements TamanhoImplementation
{
	@Override
	public String tamanho() {
		return "GG";
	}

	@Override
	public String dimensoes() {
		return "30cm x 40cm";
	}

	@Override
	public int numero() {
		return 0;
	}
}