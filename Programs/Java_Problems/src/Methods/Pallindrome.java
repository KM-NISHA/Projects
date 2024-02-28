package Methods;

import java.util.Scanner;

public class Pallindrome {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number");
    int num = sc.nextInt();
    boolean isPallindrome = isPallindrome(num);
    if (isPallindrome) {
      System.out.println("Number is pallindrome ");
    } else
      System.out.println("Number is not pallindrome ");
  }

  public static boolean isPallindrome(int num) {
    int reverse = revese(num);
    return reverse == num;
  }

  public static int revese(int num) {

    int i = 1;
    int revese = 0;
    while (i <= num) {
      int rem = num % 10;
      revese = (revese * 10) + rem;
      num /= 10;
    }
    return revese;
  }

}
