package org.example.controller;
import org.example.model.*;;;
public final class Controlador{
    public static double calcular(String operacao, double x, double y){
        IOperation op = null;
        switch(operacao){
            case "soma":
                op = new Soma();
                break;
            case "subtracao":
                op = new Subtracao();
                break;
            case "multiplicacao":
                op = new Multiplicacao();
                break;
            case "divisao":
                op = new Divisao();
                break;
            default:
                throw new IllegalArgumentException("Operação inválida: " + operacao);
        }
        return op.calc(x, y);
    }
}
