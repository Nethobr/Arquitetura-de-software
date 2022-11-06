package br.edu.up.tamanho;

import br.edu.up.interfaces.TamanhoImplementation;

public class Numero implements TamanhoImplementation
{
	int	numero = 0;
	public Numero (int numero)
	{
		this.numero = numero;
	}	//	Fim construtor
	
	
	@Override
	public String tamanho() {
		return "Numero";
	}

	@Override
	public String dimensoes() {
		return "";
	}

	@Override
	public int numero() {
		return numero;
	}
}