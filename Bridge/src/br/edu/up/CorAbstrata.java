package br.edu.up;

public abstract class CorAbstrata
{
	protected CorImplementation cor;
	public CorAbstrata (CorImplementation cor)
	{
		this.cor = cor;
	}

	public String getNome()
	{
		return cor.getNome();
	}
	
	abstract public void criarCor();
}
