import java.util.Scanner;

public class Resolucao {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int NumElements = scan.nextInt();
        scan.nextLine();
        String EntElements = scan.nextLine();
        String[] Elements = EntElements.split(" ");
        int sum = 0;

        for (int i = 0; i < NumElements; i++) {
            int values = Integer.parseInt(Elements[i]);

            sum += values;
        }

        System.out.println(sum);
        scan.close();
    }
}
