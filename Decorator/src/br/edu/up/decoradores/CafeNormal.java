package br.edu.up.decoradores;

import br.edu.up.Cafe;

public class CafeNormal implements Cafe
{
	//	Essa é a implementação para um café normal,
	//	que pode ser decorado.
	
	public String nome	= "Coffe";
	public double preco	= 1.00;
	
	@Override
	public double precoCafe() {
		return preco;
	}

	@Override
	public String tipoDoCafe() {
		return nome;
	}
}