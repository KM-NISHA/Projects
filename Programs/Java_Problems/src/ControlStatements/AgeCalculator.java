package ControlStatements;

import java.util.Scanner;

public class AgeCalculator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your Age");
    int age = sc.nextInt();

    if (age <= 13) {
      System.out.println("You are child");
    } else if (age <= 20) {
      System.out.println("You are teenager");
    } else if (age <= 60) {
      System.out.println("You are an Adult");
    } else {
      System.out.println("You are senior citizen");
    }
  }
}
