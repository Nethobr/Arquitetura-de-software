package br.edu.up.decoradores;

import br.edu.up.Cafe;
import br.edu.up.CafeDecorator;

public class Canela extends CafeDecorator
{
	public Canela(Cafe cafe) {
		super(cafe);
	}
	
	@Override
	public double precoCafe() {
		return super.precoCafe() + 0.50;
	}
	
	@Override
	public String tipoDoCafe() {
		return super.tipoDoCafe() + " + canela";
	}
}