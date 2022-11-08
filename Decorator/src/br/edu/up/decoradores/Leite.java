package br.edu.up.decoradores;

import br.edu.up.Cafe;
import br.edu.up.CafeDecorator;

public class Leite extends CafeDecorator
{

	public Leite(Cafe cafe) {
		super(cafe);
	}
	
	@Override
	public double precoCafe() 
	{
		return super.precoCafe() + 1.50;
	}
	
	@Override
	public String tipoDoCafe() 
	{
		
		return super.tipoDoCafe() + " + leite";
	}
}