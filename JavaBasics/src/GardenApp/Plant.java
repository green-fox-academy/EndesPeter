package GardenApp;

public abstract class Plant implements Waterable {


  int currentWaterAmount;
  String color;


  public Plant(int currentWaterAmount, String color) {
    this.currentWaterAmount = 0;
    this.color = color;
  }


}
