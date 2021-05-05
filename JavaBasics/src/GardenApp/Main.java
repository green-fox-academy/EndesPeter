package GardenApp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

  public static void main(String[] args) {

    Flower first = new Flower(3, "yellow");
    Flower second = new Flower(30, "blue");
    Tree third = new Tree(7, "purple");
    Tree fourth = new Tree(25, "orange");

    List<Plant> garden = new ArrayList<>();
    garden.add(first);
    garden.add(second);
    garden.add(third);
    garden.add(fourth);


    if (first.currentWaterAmount < 5) {
      System.out.println("The yellow flower needs water");
    } else {
      System.out.println("The yellow flower does not need water");
    }
    if (second.currentWaterAmount < 5) {
      System.out.println("The blue flower needs water");
    } else {
      System.out.println("The blue flower does not need water");
    }
    if (third.currentWaterAmount < 10) {
      System.out.println("The purple tree needs water");
    } else {
      System.out.println("The purple tree does not need water");
    }
    if (fourth.currentWaterAmount < 10) {
      System.out.println("The orange tree needs water");
    } else {
      System.out.println("The orange tree does not need water");
    }

   /* for (int i = 0; i < garden.size(); i++) {
      if (first.currentWaterAmount <= 5) {
        first.water1();
      }
    }

    for (int j = 0; j < garden.size(); j++) {
      if (second.currentWaterAmount <= 5) {
        second.water1();
      }
    }
    for (int k = 0; k < garden.size(); k++) {
      if (third.currentWaterAmount <= 5) {
        third.water1();
      }
    }

    for (int l = 0; l < garden.size(); l++){
      if (fourth.currentWaterAmount <= 5) {
        fourth.water1();
      }
    }
*/


            /*first.water1();
            fourth.water1();
            second.water1();
            third.water1();*/

            /*if (first.currentWaterAmount < 5) {
              System.out.println("The yellow flower needs water  ");
            } else {
              System.out.println("The yellow flower does not need water");
            }
            if (second.currentWaterAmount < 5) {
              System.out.println("The blue flower needs water");
            } else {
              System.out.println("The blue flower does not need water");
            }
            if (third.currentWaterAmount < 10) {
              System.out.println("The purple tree needs water");
            } else {
              System.out.println("The purple tree does not need water");
            }
            if (fourth.currentWaterAmount < 10) {
              System.out.println("The orange tree needs water");
            } else {
              System.out.println("The orange tree does not need water");
            }*/


  }
}






