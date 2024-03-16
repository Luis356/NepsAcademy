package Milhao;

import java.util.Scanner;

public interface Resolucao {
    public static void main(String[] args) {

        int entradaDia, somaValores = 0;
        int[] entradaValores;
        
        Scanner scan = new Scanner(System.in);
        entradaDia = scan.nextInt();
        entradaValores = new int[entradaDia];

        for (int i = 0; i < entradaValores.length; i++) {

            entradaValores[i] = scan.nextInt();
            somaValores += entradaValores[i];

            if (somaValores >= 1000000) {
                System.out.println(i+=1);
                break;
            }

        }

        scan.close();
    }
}
