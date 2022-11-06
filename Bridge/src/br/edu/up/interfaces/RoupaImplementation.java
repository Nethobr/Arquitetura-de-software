package br.edu.up.interfaces;

import br.edu.up.abstracoes.CorAbstrata;
import br.edu.up.abstracoes.EstampaAbstrata;
import br.edu.up.abstracoes.MarcaAbstrata;
import br.edu.up.abstracoes.TamanhoAbstrato;

public interface RoupaImplementation
{
	//	Nome
	void setRoupa(String roupa);
	
	//	Cor
	void setCor(CorAbstrata cor);
	
	//	Marca
	void setMarca(MarcaAbstrata marca);
	
	// Estampa
	void setEstampa(EstampaAbstrata estampa);
	
	//	Tamanho
	void setTamanho(TamanhoAbstrato tamanho);

}	// CamisaImplementation