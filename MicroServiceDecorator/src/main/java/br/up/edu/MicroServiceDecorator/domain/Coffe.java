package br.up.edu.MicroServiceDecorator.domain;

abstract public class Coffe
{
    protected String produto    = "";
    protected double preco      = 0;

    public String getCafe()
    {
        return produto;
    }   //  getCafe

    public double precoProduto()
    {
        return preco;
    }   //  precoProduto
}