package org.example.view;
import org.example.model.IOperation;
import org.reflections.Reflections;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.example.controller.*;

public class Menu {
    double a, b;
    public void show(){
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;
        

        while (opcao != 0) {
            System.out.println("=== Calculadora ===");
            Reflections reflections = new Reflections("org.example.model");

            // Busca todas as classes que implementam a interface IOperation
            Set<Class<? extends IOperation>> classes = reflections.getSubTypesOf(IOperation.class);
            List<Class<? extends IOperation>> listaDeClasses = new ArrayList<>(classes);

            int iterator = 1;
            // Imprime o nome das classes que implementam a interface
            for (Class<? extends IOperation> clazz : classes) {
                System.out.println(iterator + ". " + clazz.getSimpleName());
                iterator += 1;
            }
            System.out.print("0. Sair\n ");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner = new Scanner(System.in);
            System.out.println("Digite o primeiro valor: ");
            a = scanner.nextDouble();
            System.out.println("Digite o segundo valor: ");
            b = scanner.nextDouble();
            System.out.println("Resultado: " + Controlador.calcular(listaDeClasses.get(opcao-1).getSimpleName(), a, b));
            }
        scanner.close();
    }
}
