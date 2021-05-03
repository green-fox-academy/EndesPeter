package FirstExercises;

import java.util.Scanner;

public class Exercise10 {
  public static void main(String[] args) {


    int girls;
    int boys;

    System.out.println("Please type in the number of girls");

    Scanner input = new Scanner(System.in);


    girls = input.nextInt();


    System.out.println("Now type in the number of boys!");


    boys = input.nextInt();

    if (boys == girls && girls + boys > 20) {
      System.out.println("The party is excellent");
    } else if (girls + boys < 20 && girls == boys) {
      System.out.println("Average party");
    } else if (girls == 0) {
      System.out.println("Sausage party");
    }

  }
}


