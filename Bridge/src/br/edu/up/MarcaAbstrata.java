package br.edu.up;

public abstract class MarcaAbstrata 
{
	protected MarcaImplementation marca;
	public MarcaAbstrata (MarcaImplementation marca)
	{
		this.marca = marca;
	}
	
	public void getNome()
	{
		marca.getNome();
	}
	
	abstract public void criarMarca();
}
