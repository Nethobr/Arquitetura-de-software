package br.edu.up;

import br.edu.up.decoradores.CafeNormal;
import br.edu.up.decoradores.Canela;
import br.edu.up.decoradores.Leite;
import br.edu.up.decoradores.Remover;

public class Main 
{
	public static void escreveCafe(Cafe cafe)
	{
		System.out.println("Product: " + cafe.tipoDoCafe() + ".");
		System.out.println("Price: " + cafe.precoCafe());
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
		
		cafe = new Remover(cafe, new Leite());
		escreveCafe(cafe);
		
		cafe = new Remover(cafe, new Canela());
		escreveCafe(cafe);
		
		cafe = new Leite(cafe);
		escreveCafe(cafe);
	}	//	Main
}