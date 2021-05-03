package Filemanipulations;

import java.sql.SQLOutput;
import java.util.Scanner;


public class Filemanipulations1 {
  public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);

    int Useradd = scanner.nextInt();

    System.out.println("Your number is: " + Useradd);


    numberDevider(Useradd);
  }

  private static void numberDevider(int userAdd) {


    try {
      int devidedNumber = 10 / userAdd;
      System.out.println("Your result is: " + devidedNumber);
    } catch (ArithmeticException e) {

      System.out.println("FAIL");
    }
  }

}