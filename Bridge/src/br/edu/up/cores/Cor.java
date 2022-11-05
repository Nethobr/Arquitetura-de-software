package br.edu.up.cores;

import br.edu.up.CorAbstrata;
import br.edu.up.CorImplementation;

public class Cor extends CorAbstrata
{

	public Cor(CorImplementation cor) {
		super(cor);
	}

	@Override
	public void criarCor() {
		getNome();
	}
}