package br.up.edu.MicroServiceDecorator.models;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class CoffeModel 
{
    private int     id;
    private String  produto;
    private double  preco;

    
    public String getProduto() {
        return produto;
    }
    public void setProduto(String produto) {
        this.produto = produto;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    } 
}