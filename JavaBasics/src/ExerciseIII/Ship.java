package ExerciseIII;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ship {

  int amountOfGold;
  boolean woodenleg = true;
  int sumOfGold;


  List<String> nameOfPirates = new ArrayList<>();




  public List getPoorPirates() {
    return nameOfPirates;
  }

  public int getGolds(int amountOfGold) {
    return sumOfGold;

  }

  public void lastDayOnTheShip() {
    Pirate.party();


  }

  public void prepareForBattle() {
    for (int i = 0; i == 5; i++) {
      Pirate.work();

    }

  }
}
