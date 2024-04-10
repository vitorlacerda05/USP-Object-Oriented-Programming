/*

Crie uma calculadora que possa realizar operações básicas de adição, subtração, multiplicação e divisão. 
A calculadora deve ser implementada usando classes, métodos e objetos. Ela deve permitir que o usuário insira dois números
e selecione a operação desejada. Em seguida, deve exibir o resultado da operação.

 */

import java.util.Scanner;

public class Calculator {

    // Estados privados
    private double number1, number2;

    // Função construtora para receber números de fora e dar input aos estados privados
    public Calculator(double n1, double n2){
        number1 = n1;
        number2 = n2;
    }

    public double Soma() {
        return (number1 + number2);
    }

    public double Subtracao() {
        return (number1 - number2);
    }

    public double Multiplicacao() {
        return (number1 * number2);
    }

    public double Divisao() {
        return (number1 / number2);
    }

    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in); // Criando objeto Scanner
        
        System.out.print("Digite o primeiro numero: ");
        double n1 = scanner.nextDouble();

        System.out.print("\nDigite o segundo numero: ");
        double n2 = scanner.nextDouble();

        Calculator calculo = new Calculator(n1, n2); // Criando o objeto Calculo
        
        System.out.println("\nDigite a opcao: ");
        System.out.println("1. Somar ");
        System.out.println("2. Subtrair ");
        System.out.println("3. Multiplicar ");
        System.out.println("4. Dividir ");
        int opcao = scanner.nextInt();

        double resultado = 0;

        switch (opcao) {
            case 1:
                resultado = calculo.Soma();
                break;
            case 2:
                resultado = calculo.Subtracao();
                break;
            case 3:
                resultado = calculo.Multiplicacao();
                break;
            case 4:
                resultado = calculo.Divisao();
                break;
            default:
                System.out.println("Opção inválida!");
                return;
        }

        System.out.println("\nO resultado da operação é: " + resultado);

        scanner.close(); // Fechando o Scanner

    }
}