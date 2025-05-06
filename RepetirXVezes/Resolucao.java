package RepetirXVezes;

import java.util.Scanner;

public class Resolucao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int quantidadeRepetida = scan.nextInt();

        for (int controle = 0; controle < quantidadeRepetida; controle++) {
            System.out.println("NepsAcademy eh Sucesso");
        }

        scan.close();
    }
}
