package br.com.PROJava;

import java.util.Scanner;
/**
 * Desafio
 **  Você está planejando uma mudança para a Irlanda e
 * precisa calcular qual será o seu salário líquido,
 * considerando o imposto a ser pago à Receita Federal.
 * Para isso, você precisa implementar um programa que
 * receba como entrada o seu salário bruto e o valor dos
 * benefícios recebidos (como vale-refeição ou vale-transporte)
 * e calcule a liquota (até 1100,00 -> 5%), (1100,01 até
 * 2.500,00 -> 10%) e (Acima de 2.500,00 -> 15%) a ser pago.
 **  O programa deve calcular o Imposto a ser pago de acordo
 * com a tabela acima e, em seguida, subtrair esse valor do
 * Salário Bruto mais os Benefícios, para obter o Salário Líquido.*/
public class MudancaparaIrlanda {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Leitura do salário e dos benefícios
        double salarioBruto = input.nextDouble();
        double beneficios = input.nextDouble();

        double imposto = 0;
        if (salarioBruto == 1100.00) {
            imposto = 0.05 * salarioBruto;
        } else if (salarioBruto >= 1100.01 && salarioBruto <= 2500.00) {
            imposto = 0.1  * salarioBruto;
        } else {
            imposto = 0.15 * salarioBruto;
        }
        //TODO: Implemente as regras para o cálculo do imposto.

        // Cálculo do salário líquido
        double salarioLiquido = salarioBruto - imposto + beneficios;

        System.out.printf(" %.2f", salarioLiquido);

        //TODO: Imprimir o salário líquido com 2 casas decimais.
    }

}
