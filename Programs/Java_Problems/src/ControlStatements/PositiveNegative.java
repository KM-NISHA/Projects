package ControlStatements;

import java.util.Scanner;

public class PositiveNegative {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any number");
    int num = sc.nextInt();

    if (num < 0) {
      System.out.println("Entered number is negative");
    } else if (num > 0) {
      System.out.println("Entered number is positive");
    } else
      System.out.println("Entered number is zero");
  }

}