package FirstExercises;

import java.util.Scanner;
import org.w3c.dom.ls.LSOutput;

public class Exercise1 {
  public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);
    int userinput = scanner.nextInt();

    if (userinput % 2 == 0) {

      System.out.println("Your number is even");
    } else {
      System.out.println("Your number is odd");
    }

    while (userinput % 2 == 0) {
    }
  }


}




