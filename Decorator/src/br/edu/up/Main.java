package br.edu.up;

import br.edu.up.decoradores.Canela;
import br.edu.up.decoradores.Leite;

public class Main 
{
	public static void escreveCafe(Cafe cafe)
	{
		System.out.println("Produto: " + cafe.tipoDoCafe() + ".");
		System.out.println("Preço: " + cafe.precoCafe());
		System.out.println();
	}
	
	public static void main(String[] args) 
	{
		Cafe cafe = new CafeNormal();
		escreveCafe(cafe);
		
		cafe = new Leite(cafe);
		escreveCafe(cafe);
		
		cafe = new Canela(cafe);
		escreveCafe(cafe);
	}	//	Main
}