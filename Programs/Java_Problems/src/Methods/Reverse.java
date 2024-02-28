package Methods;

import java.util.Scanner;

public class Reverse {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any number");
    int num = sc.nextInt();
    System.out.println(reverse(num));
  }

  public static int reverse(int num) {
    int temp = 0;
    int i = 1;
    while (i <= num) {// 5<= 1, 2<=12
      int rem = num % 10;// 3
      temp = (temp * 10) + rem;// 3
      num /= 10;// 12
    }

    return temp;
  }
}
