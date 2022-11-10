package br.up.edu.MicroServiceDecorator.decorator;

import br.up.edu.MicroServiceDecorator.domain.Coffe;

public class LeiteDecorator extends Decorator
{
    public LeiteDecorator () {}
    public LeiteDecorator (Coffe coffe)
    {
        this.coffe = coffe;
    }
    
    private String prod     = "Leite";
    private double preco    = 1.00;

    //  Getters do decorador
    public String getProd() 
    {
        return prod;
    } 
    public double getPreco() 
    {
        return preco;
    }

    //  
    @Override
    public String getCafe() 
    {
        return coffe.getCafe() + " + " + prod;
    }   //  getCafe

    @Override
    public double precoProduto() 
    {
        return coffe.precoProduto() + preco;
    }   //  precoProduto
}   