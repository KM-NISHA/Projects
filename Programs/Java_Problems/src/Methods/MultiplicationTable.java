package Methods;

import java.util.Scanner;

public class MultiplicationTable {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number");
    int num = sc.nextInt();
    multiplication(num);

  }

  public static void multiplication(int num) {

    int i = 1;
    while (i <= 10) {
      System.out.println(num + " X " + i + " = " + (num * i));
      i++;
    }

  }
}
