package br.edu.up;

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
	
	public void setTamanho(String t)
	{
		roupa.setTamanho(t);
	}	
	
	public void setEstampa(EstampaImplementation e)
	{
		roupa.setEstampa(e);
	}
	
	public void setMarca(MarcaAbstrata marca)
	{
		roupa.setMarca(marca);
	}
	
	public void setCor (String cor)
	{
		roupa.setCor(cor);
	}

	// Manda criar a roupa
	public abstract void criarRoupa();
}