package br.edu.up.estampas;

import java.util.ArrayList;

import br.edu.up.EstampaImplementation;

public class Caveira implements EstampaImplementation
{
	@Override
	public String desenhoEstampa(){
		return "Caveira";
	}

		
	@Override
	public ArrayList<String> detalheEstampa() 
	{
		ArrayList<String> detalhes = 
				new ArrayList<>();
		
		detalhes.add("Osso");
		detalhes.add("Osso velho");
		detalhes.add("Ossinho");
		
		return detalhes;
	}
}
