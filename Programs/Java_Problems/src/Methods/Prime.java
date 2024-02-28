package Methods;

import java.util.Scanner;

public class Prime {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any number");
    int num = sc.nextInt();
    boolean result = isPrime(num);
    if (result) {
      System.out.println("Number is prime");
    } else
      System.out.println("Number is not prime");

  }

  public static boolean isPrime(int num) {
    int i = 2;
    while (i < num) {
      if (num % i == 0) {
        return false;
      }
      i++;
    }
    return true;
  }
}
