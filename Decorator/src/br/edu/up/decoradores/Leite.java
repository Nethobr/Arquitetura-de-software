package br.edu.up.decoradores;

import br.edu.up.Cafe;
import br.edu.up.CafeDecorator;

public class Leite extends CafeDecorator
{

	public Leite() { super(null); }
	public Leite(Cafe cafe) {
		super(cafe);
	}
	
	public String nome	= "Leite";
	public double preco	= 1.50; 
	
	@Override
	public double precoCafe() {
		return super.precoCafe() + preco;
	}
	
	@Override
	public String tipoDoCafe() {
		return super.tipoDoCafe() + " + " + nome;
	}
	
	@Override
	public String getTipo() {
		return nome;
	}

	@Override
	public double getPreco() {
		return preco;
	}
}