package Methods;

import java.util.Scanner;

public class Pattern {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number");
    int num = sc.nextInt();
    pattern1(num);
    System.out.println("Pattern 2");
    pattern2(num);
    System.out.println("Pattern 3");
    pattern3(num);
  }

  public static void pattern1(int num) {
    for (int i = 1; i <= num; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*" + " ");
      }
      System.out.println();
    }

  }

  public static void pattern2(int num) {
    for (int i = 1; i <= num; i++) {
      for (int j = 5; j >= i; j--) {
        System.out.print("*" + " ");
      }
      System.out.println();
    }
  }

  public static void pattern3(int num) {
    for (int i = 1; i <= num; i++) {
      for (int j = 1; j <= num - i; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
