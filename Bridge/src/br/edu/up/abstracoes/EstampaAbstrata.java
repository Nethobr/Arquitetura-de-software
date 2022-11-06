package br.edu.up.abstracoes;

import java.util.ArrayList;

import br.edu.up.interfaces.EstampaImplementation;

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