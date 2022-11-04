package br.edu.up.estampas;

import java.util.ArrayList;

import br.edu.up.EstampaImplementation;

public class Caveira implements EstampaImplementation
{

	private	ArrayList<String> detalhes;

	@Override
	public String desenhoEstampa(){
		return "Caveira";
	}

	@Override
	public ArrayList<String> detalheEstampa() 
	{
		detalhes.add("Osso");
		detalhes.add("Muito osso");
		return detalhes;
	}
}
