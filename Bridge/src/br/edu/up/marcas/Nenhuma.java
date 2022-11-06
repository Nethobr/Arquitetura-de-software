package br.edu.up.marcas;

import br.edu.up.interfaces.MarcaImplementation;

public class Nenhuma implements MarcaImplementation
{

	@Override
	public String getNome() {
		return "Sem marca";
	}
}