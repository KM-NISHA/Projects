package Methods;

import java.util.Scanner;

public class GCD {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number");
    int num1 = sc.nextInt();
    System.out.println("Enter second number");
    int num2 = sc.nextInt();
    System.err.println("LCM of " + num1 + " and " + num2 + " is " + gcd(num1, num2));
  }

  public static int gcd(int a, int b) {

    int gcd = 1;
    int least = least(a, b);
    for (int i = 2; i <= least; i++) {
      if (a % i == 0 && b % i == 0) {
        gcd = i;
      }
    }
    return gcd;
  }

  public static int least(int a, int b) {
    if (a < b) {
      return a;
    } else
      return b;
  }
}
