package br.edu.up;

public class Remover implements Cafe
{
	private CafeDecorator dec;
	private Cafe cafe;
	public Remover(Cafe cafe, 
			CafeDecorator dec) {
		this.dec = dec;
		this.cafe = cafe;
	}

	@Override
	public double precoCafe() {
		if(cafe.tipoDoCafe()
				.contains(dec.getTipo()))
			return cafe.precoCafe() - dec.getPreco();
		else
			return cafe.precoCafe();
	}

	@Override
	public String tipoDoCafe() {
		if(cafe.tipoDoCafe()
				.contains(dec.getTipo()))
			return cafe.tipoDoCafe()
					.replace(" + " + dec.getTipo(), "");
		else
			return cafe.tipoDoCafe();
	}
}