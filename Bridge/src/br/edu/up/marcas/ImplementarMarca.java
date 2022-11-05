package br.edu.up.marcas;

import br.edu.up.MarcaAbstrata;
import br.edu.up.MarcaImplementation;

public class ImplementarMarca extends MarcaAbstrata
{
	public ImplementarMarca(MarcaImplementation marca) {
		super(marca);
	}

	@Override
	public void criarMarca() {
		getNome();
	}

}
