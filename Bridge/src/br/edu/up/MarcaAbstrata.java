package br.edu.up;

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
