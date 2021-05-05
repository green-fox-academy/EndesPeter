package GardenApp;

public class Flower extends Plant {


  public Flower(int currentWaterAmount, String color) {
    super(currentWaterAmount, color);

  }

  @Override
  public void water1() {
    this.currentWaterAmount += 40 * 0.7;

  }

  @Override
  public void water2() {
    this.currentWaterAmount += 70 * 0.7;


  }


}
