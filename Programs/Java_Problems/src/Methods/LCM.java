package Methods;

import java.util.Scanner;

public class LCM {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number");
    int num1 = sc.nextInt();
    System.out.println("Enter number");
    int num2 = sc.nextInt();
    System.err.println("LCM of " + num1 + " and " + num2 + " is " + lcm(num1, num2));
  }

  public static int lcm(int a, int b) {

    for (int i = 1; true; i++) {
      int factor = a * i;
      if (factor % b == 0) {
        return factor;
      }
    }
  }
}
