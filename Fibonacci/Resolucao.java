package Fibonacci;

import java.util.Scanner;

public class Resolucao {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    scan.close();

    System.out.println(fibonacci(N));

  }

  public static int fibonacci(int n) {
    if (n == 0) {
      return 1;
    }
    if (n == 1) {
      return 1;
    }
    int var1 = 1, var2 = 1, var3;
    for (int i = 2; i <= n; i++) {
      var3 = var1 + var2;
      var1 = var2;
      var2 = var3;
    }
    return var2;
  }

}
