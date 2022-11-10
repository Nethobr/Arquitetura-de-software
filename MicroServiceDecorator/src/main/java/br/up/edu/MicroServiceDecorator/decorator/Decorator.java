package br.up.edu.MicroServiceDecorator.decorator;

import br.up.edu.MicroServiceDecorator.domain.Coffe;

abstract public class Decorator extends Coffe
{
    Coffe coffe;
    public abstract String getProd();
    public abstract double getPreco();
    public abstract String getCafe();
}