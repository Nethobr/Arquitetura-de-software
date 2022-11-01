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
	
	public void setMarca(String m)
	{
		roupa.setMarca(m);
	}
	
	public void setCor ()
	{
		roupa.setCor();
	}

	// Manda criar a roupa
	public abstract void criarRoupa();
}