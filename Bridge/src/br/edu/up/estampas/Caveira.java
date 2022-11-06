package br.edu.up.estampas;

import java.util.ArrayList;

import br.edu.up.interfaces.EstampaImplementation;

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
		detalhes.add("Osso novo");
		
		return detalhes;
	}
}
