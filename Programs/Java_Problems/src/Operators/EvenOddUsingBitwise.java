package Operators;

import java.util.Scanner;

public class EvenOddUsingBitwise {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any number");
    int num = sc.nextInt();

    if ((num & 1) == 1) {
      System.out.println("Entered number is Odd");
    } else
      System.out.println("Entered number is Even");
  }
}
