package br.edu.up.estampas;

import java.util.ArrayList;

import br.edu.up.interfaces.EstampaImplementation;

public class Moranguinho implements EstampaImplementation 
{
	@Override
	public String desenhoEstampa() {
		return "Moranguinho";
	}

	@Override
	public ArrayList<String> detalheEstampa() {
		ArrayList<String> detalhes = 
				new ArrayList<>();
		
		detalhes.add("Babado branco");
		detalhes.add("Gliter");
		detalhes.add("Laço");		
		
		return detalhes;
	}

}