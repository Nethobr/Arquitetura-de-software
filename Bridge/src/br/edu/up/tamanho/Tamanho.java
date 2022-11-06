package br.edu.up.tamanho;

import br.edu.up.abstracoes.TamanhoAbstrato;
import br.edu.up.interfaces.TamanhoImplementation;

public class Tamanho extends TamanhoAbstrato
{

	public Tamanho(TamanhoImplementation tamanho) {
		super(tamanho);
	}

	@Override
	public void criarTamanho() {
		tamanho();
		dimensoes();
		numero();
	}
}