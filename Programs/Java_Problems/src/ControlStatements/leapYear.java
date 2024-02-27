package ControlStatements;

import java.util.Scanner;

public class leapYear {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Year");
    int a = sc.nextInt();

    if (a % 400 == 0 || (a % 4 == 0 && a % 100 != 0)) {
      System.out.println("Entered year is leap year ");
    } else
      System.out.println("Entered year is not a leap year");

  }
}
