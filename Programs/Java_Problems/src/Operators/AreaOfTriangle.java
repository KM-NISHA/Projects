package Operators;

import java.util.Scanner;

public class AreaOfTriangle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter base of triangle:");
    int base = sc.nextInt();
    System.out.println("Enter height of triangle:");
    int height = sc.nextInt();

    int area = (base * height) / 2;
    System.out.println("Area of Traingle is: " + area);
  }
}
