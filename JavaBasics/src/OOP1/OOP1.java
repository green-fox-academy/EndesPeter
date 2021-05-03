package OOP1;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class OOP1 {
  public static void main(String[] args) {

    Animal monkey = new Animal();

    System.out.println();
    System.out.println(
        "The monkey is thirsty & hungry! Give him a banana by pressing `F`, or water by pressing `W` " +
            monkey.hunger);


    Scanner sc = new Scanner(System.in);

    String userInput = sc.next();
    userInput = userInput.toUpperCase();


    switch (userInput) {


      case "F":
        monkey.eat();
      case "W":
        monkey.drink();

        System.out.println("Hunger: " + monkey.hunger);
        System.out.println("Thirst: " + monkey.thirst);

        System.out.println("Time to play with the monkey. Press P");
    }

    String userInput2 = sc.next();
    userInput2 = userInput2.toUpperCase();

    switch (userInput2) {
      case "P":
        monkey.play();
    }
    System.out.println("Oops, now he is hungry again:)");


    System.out.println(monkey.hunger);
    System.out.println(monkey.thirst);


  }
}

