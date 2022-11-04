package br.edu.up;

public class ImplementarRoupa implements RoupaImplementation
{
	@Override
	public void setRoupa(String roupa) {
		System.out.println(roupa);
	}
	
	@Override
	public void setMarca(String marca) {
		System.out.println("Marca: " + marca + ".");
	}
	
	@Override
	public void setEstampa(String e) {
		System.out.println("Estampa: " + e + ".");	
	}
	
	@Override
	public void setTamanho(String tam) {
		System.out.println("Tamanho: " + tam + ".");
	}
	
	@Override
	public void setCor(String cor) {
		System.out.println("Cor: " + cor + ".");
	}
}
