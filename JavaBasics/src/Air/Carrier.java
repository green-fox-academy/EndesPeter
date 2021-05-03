/*package Air;

import java.util.ArrayList;
import java.util.List;

public class Carrier<List> {


  int storedAmmo;
  int healthPoint;
  List<Aircraft> storage = new ArrayList<>();


  public Carrier(int healthPoint, int storedAmmo) {
    this.storedAmmo = storedAmmo;
    this.healthPoint = healthPoint;

  }

  public void add(Aircraft fighter) {
    storage.add(fighter);
  }

  public void fill() throws Exception {
    if (storedAmmo == 0) {
      throw new Exception("No more ammo");
    }
    boolean enoughAmmo = isThereEnoughAmmo();
    if (enoughAmmo) {
      for (int i = 0; i < storage.size(); i++) {
        Aircraft checked = storage.get(i);
        int returnValue = checked.refillAmmo(storedAmmo);
        storedAmmo = returnValue;

      }

    } else {
      for (int i = 0; i < storage.size(); i++) {
        Aircraft aircraft = storage.get(i);
        if (aircraft.isPriority()) {
          int returnValue = aircraft.refillAmmo(storedAmmo);
          storedAmmo = returnValue;

        }

      }
    }


  }

  public boolean isThereEnoughAmmo() {
    int allAircraft = 0;
    for (int i = 0; i < storage.size(); i++) {
      Aircraft x = storage.get(i);
      allAircraft += x.maxAmmo - x.ammunition;

    }
    return allAircraft < storedAmmo;
  }
}


*/