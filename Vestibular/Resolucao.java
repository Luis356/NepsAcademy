package Vestibular;

import java.util.Scanner;

public class Resolucao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int quantidadeGabarito, acertos = 0;
        
        quantidadeGabarito = scan.nextInt();
        scan.nextLine();
        String entradaGabarito = scan.nextLine().toUpperCase();
        String entradaCandidato = scan.nextLine().toUpperCase();

        char[] vetorGabarito = entradaGabarito.toCharArray();
        char[] vetorCandidato = entradaCandidato.toCharArray();

        for (int i = 0; i < quantidadeGabarito; i++) {

            if (vetorGabarito[i] == vetorCandidato[i]) {
                acertos++;
            }

        }
        System.out.println(acertos);

        scan.close();
    }
}
