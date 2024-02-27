package Operators;

import java.util.Scanner;

public class PerimeterOfRectangle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter length of Rectangle:");
    int length = sc.nextInt();
    System.out.println("Enter breath of Rectangle:");
    int breath = sc.nextInt();

    int perimetr = 2 * (length + breath);
    System.out.println("Permimeter of Rectangle is: " + perimetr);
  }
}
