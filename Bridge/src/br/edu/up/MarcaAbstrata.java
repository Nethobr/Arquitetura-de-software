package br.edu.up;

public abstract class MarcaAbstrata 
{
	MarcaImplementation marca;
	public MarcaAbstrata(MarcaImplementation marca)
	{
		this.marca = marca;
	}
	
	public String getNome(String g)
	{
		return marca.getNome();
	}
	
	abstract void criarMarca();
}