package GardenApp;

public class Tree extends Plant {


  public Tree(int currentWaterAmount, String color) {
    super(currentWaterAmount, color);

  }

  @Override
  public void water1() {
    this.currentWaterAmount += 40 * 0.4;


  }

  @Override
  public void water2() {
    this.currentWaterAmount += 70 * 0.7;


  }


}
