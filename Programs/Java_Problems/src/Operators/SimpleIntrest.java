package Operators;

import java.util.Scanner;

public class SimpleIntrest {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Principle amount :");
    int p = sc.nextInt();
    System.out.println("For how many years you are borrowing :");
    float t = sc.nextFloat();
    System.out.println("Tell me your Rate of intrest :");
    float r = sc.nextFloat();

    float simpleIntrest = (p * t * r) / 100;
    System.out.println("Simple intrest is: " + simpleIntrest);
  }
}
