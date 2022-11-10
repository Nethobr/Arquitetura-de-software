package br.up.edu.MicroServiceDecorator.decorator;

import br.up.edu.MicroServiceDecorator.domain.Coffe;

public class CanelaDecorator extends Decorator
{
    public CanelaDecorator () {}
    public CanelaDecorator (Coffe coffe)
    {
        this.coffe = coffe;
    }
    
    private String prod     = "Canela";
    private double preco    = 0.5;

    public String getProd() {
        return prod;
    }

    public double getPreco() {
        return preco;
    }

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
