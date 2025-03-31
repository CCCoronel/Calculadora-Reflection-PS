package org.example.model;

public class Soma implements  IOperation{
    @Override
    public double calc(double a, double b) {
        return a + b;
    }
}
