package Operators;

import java.util.Scanner;

public class BasicSwap {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number: ");
    int num1 = sc.nextInt();
    System.out.println("Enter second number: ");
    int num2 = sc.nextInt();
    System.out.println("numbers are:" + num1 + " and " + num2);

    int temp = num1;
    num1 = num2;
    num2 = temp;
    System.out.println("numbers after swapping are:" + num1 + " and " + num2);

  }
}
