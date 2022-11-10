package br.up.edu.MicroServiceDecorator.adapter;

import br.up.edu.MicroServiceDecorator.domain.Coffe;
import br.up.edu.MicroServiceDecorator.domain.JSON;

public class CoffeAdapterJson implements JSON
{
    private Coffe coffe;
    public CoffeAdapterJson (Coffe coffe)
    {
        this.coffe = coffe;
    }   //  Constructor

    public String toString()
    {
        return  "{\n" + 
                "   \"produto\": " + "\""+coffe.getCafe()+"\",\n" +
                "   \"preco\": "+coffe.precoProduto()+"\n" + 
                "}";
    }
}