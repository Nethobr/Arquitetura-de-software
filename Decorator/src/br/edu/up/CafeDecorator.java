package br.edu.up;

public abstract class CafeDecorator implements Cafe 
{
	private final Cafe cafeDecorado;
	public CafeDecorator (Cafe cafe)
	{
		cafeDecorado = cafe;
	}	//	Fim contrutor
	

	@Override
	public double precoCafe()
	{
		return cafeDecorado.precoCafe();
	}
	
	@Override
	public String tipoDoCafe()
	{
		return cafeDecorado.tipoDoCafe();
	}
	
	public Cafe getCafe()
	{
		return cafeDecorado;
	}
}