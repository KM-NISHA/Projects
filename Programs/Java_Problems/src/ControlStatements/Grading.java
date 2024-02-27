package ControlStatements;

import java.util.Scanner;

public class Grading {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your percentage");
    int prcntage = sc.nextInt();

    if (prcntage >= 90) {
      System.out.println("You got A Grade");
    } else if (prcntage >= 75) {
      System.out.println("You got B Grade");
    } else if (prcntage >= 60) {
      System.out.println("You got C Grade");
    } else if (prcntage >= 30) {
      System.out.println("You got D Grade");
    } else {
      System.out.println("sorry, you failed the examination,you got F Grade");
    }
  }
}
