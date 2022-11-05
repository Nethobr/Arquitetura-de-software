package br.edu.up.roupas;

import br.edu.up.CorAbstrata;
import br.edu.up.EstampaImplementation;
import br.edu.up.MarcaAbstrata;
import br.edu.up.RoupaImplementation;

public class ImplementarRoupa implements RoupaImplementation
{
	@Override
	public void setRoupa(String roupa) {
		System.out.println(roupa);
	}
	
	@Override
	public void setEstampa(EstampaImplementation e) {
		System.out.println("Estampa: " + e.desenhoEstampa() + ".");
		if (!e.detalheEstampa().isEmpty())
		{
			System.out.println(" *Detalhes:");
			for(String detalhe: e.detalheEstampa())
			{
				System.out.println("	Detalhe: "+detalhe+".");
			}
		}
	}
	
	@Override
	public void setTamanho(String tam) {
		System.out.println("Tamanho: " + tam + ".");
	}

	@Override
	public void setMarca(MarcaAbstrata m) {
		System.out.println("Marca: ");	
		m.getNome();
	}

	@Override
	public void setCor(CorAbstrata cor) {
		System.out.println("Cor: "+cor.getNome()+".");
	}
}
