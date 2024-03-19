package Raizes;

import java.util.Scanner;

public class Resolucao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int primeiraEntrada;
        String valoresParaRaiz;

        primeiraEntrada = scan.nextInt();
        scan.nextLine();
        valoresParaRaiz = scan.nextLine();

        String[] raizQuebrada = valoresParaRaiz.split(" ");

        for (int i = 0; i < primeiraEntrada; i++) {

            System.out.printf("%.4f\n", Math.sqrt(Double.parseDouble(raizQuebrada[i])));

        }

        scan.close();
    }
}
