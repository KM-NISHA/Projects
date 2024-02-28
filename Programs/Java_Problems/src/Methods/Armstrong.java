package Methods;

import java.util.Scanner;

public class Armstrong {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number");
    int num = sc.nextInt();
    boolean isArmstrong = isArmstrong(num);
    if (isArmstrong) {
      System.out.println("Number is armstrong");
    } else
      System.out.println("Number is not armstrong");

  }

  public static boolean isArmstrong(int n) {
    int noOfDigits = noOfDigits(n);
    int finalnumber = 0;
    int num = n;
    while (n > 0) {
      int lastdigit = n % 10;
      n /= 10;
      finalnumber += isPower(lastdigit, noOfDigits);
    }
    return finalnumber == num;
  }

  public static int isPower(int n, int a) {
    int result = 1;
    int i = 0;
    while (i < a) {
      result *= n;
      i++;
    }
    return result;

  }

  public static int noOfDigits(int n) {
    int digits = 0;
    while (n > 0) {
      digits++;
      n /= 10;
    }
    return digits;
  }
}
