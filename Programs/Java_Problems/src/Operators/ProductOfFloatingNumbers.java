package Operators;

import java.util.Scanner;

public class ProductOfFloatingNumbers {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a:");
    float a = sc.nextFloat();
    System.out.println("enter b:");
    float b = sc.nextFloat();
    float c = a * b;
    System.out.println("Product of a & b is:" + c);
  }
}
