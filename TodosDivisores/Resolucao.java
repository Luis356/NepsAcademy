package TodosDivisores;

import java.util.Scanner;

public class Resolucao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int entradaValor;

        entradaValor = scan.nextInt();
        StringBuilder divisores = new StringBuilder();

        for (int index = 1; index <= entradaValor; index++) {

            if (entradaValor % index == 0) {

                divisores.append(index).append(" ");

            }

        }

        System.out.println(divisores);

        scan.close();
    }
}
