package br.edu.up.estampas;

import br.edu.up.EstampaAbstrata;
import br.edu.up.EstampaImplementation;

public class Estampa extends EstampaAbstrata
{

	public Estampa(EstampaImplementation estampa) {
		super(estampa);
	}

	@Override
	public void criarEstampa() {
		desenhoEstampa();
		detalheEstampa();
	}
}