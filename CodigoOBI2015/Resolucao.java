package CodigoOBI2015;

import java.util.Scanner;

public class Resolucao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int entradaValor = scan.nextInt();
        scan.nextLine();
        String entradaDados = scan.nextLine().replaceAll("\\s+", "");

        int i = 0, quantidadeCem = 0;

        while (i < entradaDados.length() - 2) {

            if (entradaDados.substring(i, i + 3).equals("100")) {
                quantidadeCem++;
                i += 3;
            }else{
                i++;
            }

        }

        System.out.println(quantidadeCem);
        scan.close();

    }
}