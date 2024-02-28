package Methods;

import java.util.Scanner;

public class SumOfOddNumbers {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number");
    int num = sc.nextInt();
    System.out.println("sum of odd num between 1 and " + num + " is:" + sumOfOdd(num));

  }

  public static int sumOfOdd(int num) {
    int sum = 0;
    for (int i = 1; i <= num; i += 2) {
      sum += i;
    }
    return sum;
  }
}
