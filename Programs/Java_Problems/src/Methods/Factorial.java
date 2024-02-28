package Methods;

import java.util.Scanner;

public class Factorial {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number");
    int num = sc.nextInt();
    System.err.println("factorial of " + num + " is " + factorial(num));

  }

  public static int factorial(int num) {
    int i = 1;
    int fact = 1;
    while (i <= num) {
      fact = fact * i;
      i++;
    }
    return fact;
  }
}
