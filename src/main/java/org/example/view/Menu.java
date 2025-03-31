package org.example.view;
import org.example.model.IOperation;
import org.reflections.Reflections;
import java.util.Set;
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
            int iterator = 1;
            // Imprime o nome das classes que implementam a interface
            for (Class<? extends IOperation> clazz : classes) {
                System.out.println(iterator + ". " + clazz.getSimpleName());
                iterator += 1;
            }
            System.out.print("0. Sair\n ");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu Somar.");   
                    scanner = new Scanner(System.in);
                    System.out.println("Digite o primeiro valor: ");
                    a = scanner.nextDouble();
                    System.out.println("Digite o segundo valor: ");
                    b = scanner.nextDouble();
                    System.out.println("Resultado: " + Controlador.calcular("soma", a, b));
                    break;

                case 2:
                    System.out.println("Você escolheu Subtrair.");
                    scanner = new Scanner(System.in);
                    System.out.println("Digite o primeiro valor: ");
                    a = scanner.nextDouble();
                    System.out.println("Digite o segundo valor: ");
                    b = scanner.nextDouble();
                    System.out.println("Resultado: " + Controlador.calcular("subtracao", a, b));
                    break;
                case 3:
                    System.out.println("Você escolheu Multiplicar.");
                    scanner = new Scanner(System.in);
                    System.out.println("Digite o primeiro valor: ");
                    a = scanner.nextDouble();
                    System.out.println("Digite o segundo valor: ");
                    b = scanner.nextDouble();
                    System.out.println("Resultado: " + Controlador.calcular("multiplicacao", a, b));
                    break;
                case 4:
                    System.out.println("Você escolheu Dividir.");
                    scanner = new Scanner(System.in);
                    System.out.println("Digite o primeiro valor: ");
                    a = scanner.nextDouble();
                    System.out.println("Digite o segundo valor: ");
                    b = scanner.nextDouble();
                    System.out.println("Resultado: " + Controlador.calcular("divisao", a, b));
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}
