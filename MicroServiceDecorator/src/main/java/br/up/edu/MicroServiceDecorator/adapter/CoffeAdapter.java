package br.up.edu.MicroServiceDecorator.adapter;

import br.up.edu.MicroServiceDecorator.domain.Coffe;
import br.up.edu.MicroServiceDecorator.models.CoffeModel;

public class CoffeAdapter
{
    private Coffe coffe;
    private CoffeModel coffeModel;
    public CoffeAdapter (CoffeModel coffeModel)
    {
        this.coffeModel = coffeModel;
    }
    public CoffeAdapter (Coffe coffe)
    {
        this.coffe = coffe;
    }   //  Constructor

    //  Adaptador JSON
    public String toJsonString()
    {
        return  "   {\n" + 
                "       \"produto\": " + "\""+coffe.getCafe()+"\",\n" +
                "       \"preco\": "+coffe.precoProduto()+"\n" + 
                "   }";
    }   //  toJsonString

    //  Adaptar para um objeto Coffe
    public CoffeModel toCoffeModel()
    {
        CoffeModel coffeModel = new CoffeModel();
        coffeModel.setId(-1);
        coffeModel.setPreco(coffe.precoProduto());
        coffeModel.setProduto(coffe.getCafe());
        return coffeModel;
    }   //  toCoffeModel

    //  Adapta para uma implementação de café
    public Coffe toCoffeImpl()
    {
        Coffe innerCoffe = new Coffe() {
            @Override
            public String getCafe() {
                return coffeModel.getProduto();
            }
            @Override
            public double precoProduto() {
                return coffeModel.getPreco();
            }
        };
        return innerCoffe;
    }  
}