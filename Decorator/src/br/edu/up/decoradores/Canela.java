package br.edu.up.decoradores;

import br.edu.up.Cafe;
import br.edu.up.CafeDecorator;

public class Canela extends CafeDecorator
{
	public Canela() { super(null); }
	public Canela(Cafe cafe) {
		super(cafe);
	}
	
	public String nome	= "Canela";
	public double preco = 0.50;
	
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