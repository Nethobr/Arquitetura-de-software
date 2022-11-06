package br.edu.up.abstracoes;

import br.edu.up.interfaces.RoupaImplementation;

public abstract class RoupaAbstrata 
{
	//	Construtor
	protected RoupaImplementation roupa;
	public RoupaAbstrata (RoupaImplementation r)
	{
		roupa = r;
	}
	
	//	Seta os atributos da roupa
	public void setRoupa(String r)
	{
		roupa.setRoupa(r);
	}
	
	public void setTamanho(TamanhoAbstrato t)
	{
		roupa.setTamanho(t);
	}	
	
	public void setEstampa(EstampaAbstrata e)
	{
		roupa.setEstampa(e);
	}
	
	public void setMarca(MarcaAbstrata marca)
	{
		roupa.setMarca(marca);
	}
	
	public void setCor (CorAbstrata cor)
	{
		roupa.setCor(cor);
	}

	// Manda criar a roupa
	public abstract void criarRoupa();
}