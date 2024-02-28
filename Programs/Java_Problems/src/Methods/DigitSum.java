package Methods;

import java.util.Scanner;

public class DigitSum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number");
    int num = sc.nextInt();
    System.err.println("Sum of " + num + " is " + digitSum(num));
  }

  public static int digitSum(int num) {

    int sum = 0;
    while (num > 0) {// 1<=125,2<=12
      sum += num % 10;
      num /= 10;
    }
    return sum;

  }
}
