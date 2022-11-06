package br.edu.up.tamanho;

import br.edu.up.interfaces.TamanhoImplementation;

public class P implements TamanhoImplementation
{
	@Override
	public String tamanho() {
		return "P";
	}

	@Override
	public String dimensoes() {
		return "30cm x 20cm";
	}

	@Override
	public int numero() {
		return 0;
	}
}