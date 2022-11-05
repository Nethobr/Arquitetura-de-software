package br.edu.up;

import java.util.ArrayList;

public abstract class EstampaAbstrata 
{
	protected EstampaImplementation estampa;
	public EstampaAbstrata (EstampaImplementation estampa)
	{
		this.estampa = estampa;
	}
	
	public String desenhoEstampa()
	{
		return estampa.desenhoEstampa();
	}
	
	public ArrayList<String> detalheEstampa()
	{
		return estampa.detalheEstampa();
	}
	
	abstract public void criarEstampa();
}