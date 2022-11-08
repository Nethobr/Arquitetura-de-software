package br.edu.up;

public class CafeNormal implements Cafe
{
	//	Essa é a implementação para um café normal,
	//	que pode ser decorado.
	
	
	@Override
	public double precoCafe() {
		return 1.00;
	}

	@Override
	public String tipoDoCafe() {
		return "Café";
	}
}