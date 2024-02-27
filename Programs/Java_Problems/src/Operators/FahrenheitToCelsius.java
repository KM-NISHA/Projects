package Operators;

import java.util.Scanner;

public class FahrenheitToCelsius {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter temperature in Fahrenheit:");
    float f = sc.nextFloat();

    float celcius = (f - 32) * 5 / 9;
    System.out.println(f + " is in celsius is: " + celcius + "c");
  }
}
