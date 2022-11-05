package br.edu.up;

public interface RoupaImplementation
{
	//	Nome
	void setRoupa(String roupa);
	
	//	Cor
	void setCor(CorAbstrata cor);
	
	//	Marca
	void setMarca(MarcaAbstrata m);
	
	// Estampa
	void setEstampa(EstampaAbstrata e);
	
	//	Tamanho
	void setTamanho(String tamanho);

}	// CamisaImplementation