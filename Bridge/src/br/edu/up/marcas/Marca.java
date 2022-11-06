package br.edu.up.marcas;

import br.edu.up.abstracoes.MarcaAbstrata;
import br.edu.up.interfaces.MarcaImplementation;

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
