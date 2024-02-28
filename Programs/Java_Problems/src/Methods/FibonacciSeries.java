package Methods;

import java.util.Scanner;

public class FibonacciSeries {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number");
    int num = sc.nextInt();
    System.err.println("factorial of " + num + " is ");
    fibonacciSeries(num);
  }

  public static void fibonacciSeries(int a) {
    if (a < 0)
      return;
    System.out.println("0");
    if (a == 0)
      return;
    System.out.println("1");

    int first = 0;// 1
    int second = 1;// 1
    while (first + second <= a) {// 1<5
      int num = first + second;// 0+1-->1,1+1-->2
      System.out.println(num);// 1,2
      first = second;// 1
      second = num;// 1,
    }
  }
}
