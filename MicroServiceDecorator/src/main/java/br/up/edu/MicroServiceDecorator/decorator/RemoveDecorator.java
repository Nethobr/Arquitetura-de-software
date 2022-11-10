package br.up.edu.MicroServiceDecorator.decorator;

import br.up.edu.MicroServiceDecorator.domain.Coffe;

public class RemoveDecorator extends Coffe
{
    private Coffe coffe;
    private Decorator decorator;
    public RemoveDecorator(Coffe coffe, Decorator decorator)
    {
        this.coffe = coffe;
        this.decorator = decorator;
    }   //  Contructor

    @Override
    public String getCafe() 
    {
        if(coffe.getCafe()
            .contains(decorator.getProd()))
            return coffe.getCafe()
                    .replace(" + " + decorator.getProd(), "");
        else
            return coffe.getCafe();
    }   //  getCafe

    @Override
    public double precoProduto() 
    {
        if(coffe.getCafe()
            .contains(decorator.getProd()))
            return coffe.precoProduto() - decorator.getPreco();
        else
            return coffe.precoProduto();
    }   //  precoProduto

}