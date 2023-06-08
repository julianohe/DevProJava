import java.util.Scanner;

/**
 * Desafio
 **  Neste desafio, você deverá ajudar o gerente
 * de uma loja geek a gerenciar o desempenho de
 * seus funcionários em um determinado período.
 * O gerente pode inserir a média das avaliações
 * de desempenho dos funcionários e o programa i-
 * rá classificar cada um deles em "APR" (bom),
 * "MED" (médio) ou "REP" (ruim), com base em cri-
 * térios predefinidos.*/

public class LojaGeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double media = scanner.nextDouble();

        if (media < 5) {
            System.out.println("REP");
        } else if (media >= 5 && media < 7) {
            System.out.println("MED");
        } else if (media > 7) {
            System.out.println("APR");

        }
    }
}
