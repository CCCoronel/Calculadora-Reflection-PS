package org.example.controller;
import java.lang.reflect.InvocationTargetException;

import org.example.model.*;;;
public final class Controlador{
    public static double calcular(String operacao, double x, double y){
        IOperation op = null;
        try {
            op = (IOperation)Class.forName("org.example.model." + operacao).getDeclaredConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
                | NoSuchMethodException | SecurityException | ClassNotFoundException e) {
            e.printStackTrace();
            return 0;
        }
        return op.calc(x, y);
    }
}
