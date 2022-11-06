package br.edu.up.abstracoes;

import br.edu.up.interfaces.MarcaImplementation;

public abstract class MarcaAbstrata 
{
	protected MarcaImplementation marca;
	public MarcaAbstrata (MarcaImplementation marca)
	{
		this.marca = marca;
	}
	
	public String getNome()
	{
		return marca.getNome();
	}
	
	abstract public void criarMarca();
}
