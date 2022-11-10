package br.up.edu.MicroServiceDecorator.decorator;

import br.up.edu.MicroServiceDecorator.domain.Coffe;

public class SorveteDecorator extends Decorator
{
    public SorveteDecorator () {}
    public SorveteDecorator (Coffe coffe)
    {
        this.coffe = coffe;
    }
    
    private String prod     = "Sorvete";
    private double preco    = 6.5;

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