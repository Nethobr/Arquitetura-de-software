package br.edu.up.cores;

import br.edu.up.abstracoes.CorAbstrata;
import br.edu.up.interfaces.CorImplementation;

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