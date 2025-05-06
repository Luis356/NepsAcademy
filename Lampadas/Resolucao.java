package Lampadas;
import java.util.Scanner;

public class Resolucao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantidadeLampadas, estadoLampadaA = 0, estadoLampadaB = 0;

        quantidadeLampadas = scan.nextInt();
        scan.nextLine(); // Consumir a quebra de linha após o número

        // Lendo a sequência de operações
        String entradaOperacoes = scan.nextLine();
        String[] operacoes = entradaOperacoes.split(" ");

        for (int i = 0; i < quantidadeLampadas; i++) {
            int operacao = Integer.parseInt(operacoes[i]);
            if (operacao == 1) {
                estadoLampadaA = 1 - estadoLampadaA; // Alternar entre 0 e 1
            } else if (operacao == 2) {
                estadoLampadaA = 1 - estadoLampadaA; // Alternar entre 0 e 1 para a lâmpada A
                estadoLampadaB = 1 - estadoLampadaB; // Alternar entre 0 e 1 para a lâmpada B
            }
        }

        System.out.println(estadoLampadaA);
        System.out.println(estadoLampadaB);

        scan.close();
    }
}
