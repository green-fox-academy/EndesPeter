package ExerciseIII;

public class Pirate implements WorkandParty {

  private String name;
  private int amountOfGold;
  private int healthPoint = 10;

  public Pirate(){

  }

  public Pirate(String name, int amountOfGold) {
    this.name = name;
    this.amountOfGold = amountOfGold;

  }


  @Override
  public void work() {
    amountOfGold += 1;
    healthPoint -= 1;
  }

  @Override
  public void party() {
    healthPoint += 1;
  }  public String getName() {
    return name;
  }

  public String String(){
    System.out.println("Hello, I'm Jack. I still have my real legs and 20 golds.");
    return String();
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAmountOfGold() {
    return amountOfGold;
  }

  public void setAmountOfGold(int amountOfGold) {
    this.amountOfGold = amountOfGold;
  }

  public int getHealthPoint() {
    return healthPoint;
  }

  public void setHealthPoint(int healthPoint) {
    this.healthPoint = healthPoint;
  }
}
