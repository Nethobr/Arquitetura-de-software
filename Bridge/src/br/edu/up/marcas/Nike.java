package br.edu.up.marcas;

import br.edu.up.interfaces.MarcaImplementation;

public class Nike implements MarcaImplementation
{
	@Override
	public String getNome() {
		return "Nike";
	}
}