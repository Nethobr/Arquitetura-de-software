package br.edu.up.abstracoes;

import br.edu.up.interfaces.TamanhoImplementation;

public abstract class TamanhoAbstrato 
{
	protected TamanhoImplementation tamanho;
	public TamanhoAbstrato (TamanhoImplementation tamanho)
	{
		this.tamanho = tamanho;
	}
	
	public String tamanho()
	{
		return tamanho.tamanho();
	}
	
	public String dimensoes() 
	{
		return tamanho.dimensoes();
	}
	
	public int numero() 
	{
		return tamanho.numero();
	}
	
	abstract public void criarTamanho();
}