package br.edu.up.roupas;

import br.edu.up.abstracoes.CorAbstrata;
import br.edu.up.abstracoes.EstampaAbstrata;
import br.edu.up.abstracoes.MarcaAbstrata;
import br.edu.up.abstracoes.TamanhoAbstrato;
import br.edu.up.interfaces.RoupaImplementation;

public class ImplementarRoupa implements RoupaImplementation
{
	@Override
	public void setRoupa(String roupa) {
		System.out.println(roupa);
	}

	@Override
	public void setMarca(MarcaAbstrata m) {
		System.out.println();
		System.out.println("Marca: "+m.getNome()+".");	
	}

	@Override
	public void setCor(CorAbstrata cor) {
		System.out.println();
		System.out.println("Cor: "+cor.getNome()+".");
	}

	@Override
	public void setEstampa(EstampaAbstrata e) {
		System.out.println();
		System.out.println("Estampa: " + e.desenhoEstampa() + ".");
		if (!e.detalheEstampa().isEmpty())
		{
			System.out.println(" * Detalhes *");
			for(String detalhe: e.detalheEstampa())
			{
				System.out.println(" - Detalhe: "+detalhe+".");
			}
		}
	}

	@Override
	public void setTamanho(TamanhoAbstrato tamanho) {
		System.out.println();
		if(!tamanho.tamanho().contains("Numero"))
		{
			System.out.println("Tamanho: " + tamanho.tamanho() + ".");
			System.out.println(" - Dimencoes: "+tamanho.dimensoes()+".");
		}
		else
		{
			System.out.println("Numero: " + tamanho.numero() + ".");
		}
	}
}
