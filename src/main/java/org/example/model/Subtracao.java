package org.example.model;

public class Subtracao implements  IOperation{
    @Override
    public double calc(double a, double b) {
        return a - b;
    }
}
