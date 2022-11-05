package br.edu.up.marcas;

import br.edu.up.MarcaAbstrata;
import br.edu.up.MarcaImplementation;

public class Marca extends MarcaAbstrata
{
	public Marca(MarcaImplementation marca) {
		super(marca);
	}

	@Override
	public void criarMarca() {
		getNome();
	}

}
