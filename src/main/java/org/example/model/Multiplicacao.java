package org.example.model;

public class Multiplicacao implements IOperation {

    @Override
    public double calc(double x, double y) {
        return x * y;
    }

}
