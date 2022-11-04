package br.edu.up.estampas;

import java.util.ArrayList;
import br.edu.up.EstampaImplementation;

public class Vazia implements EstampaImplementation
{
	ArrayList<String> detalhes = null;

	@Override
	public String desenhoEstampa(){
		return "Vazio";
	}

	@Override
	public ArrayList<String> detalheEstampa() 
	{
		return detalhes;
	}
}
