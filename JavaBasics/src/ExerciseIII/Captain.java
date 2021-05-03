package ExerciseIII;

public class Captain extends Pirate implements WorkandParty {

  private String name;
  boolean woodenLeg = true;
  private int amountOfGold;
  private int healthPoint = 10;

  public Captain() {

  }

  public Captain(String name, int amountOfGold, String name1, boolean woodenLeg) {
    super(name, amountOfGold);
    this.name = name1;
    this.woodenLeg = woodenLeg;
  }

  @Override
  public void work() {
    amountOfGold += 10;
    healthPoint -= 5;
  }

  @Override
  public void party() {
    healthPoint += 10;
  }


  public String toString() {
    System.out.println("Hello, I'm Jack. I still have my real legs and 20 golds");
    return toString();
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public void setName(String name) {
    this.name = name;
  }

  public boolean getWoodenLeg() {
    return woodenLeg;
  }

  public void setWoodenLeg(boolean woodenLeg) {
    this.woodenLeg = woodenLeg;
  }

  @Override
  public int getAmountOfGold() {
    return amountOfGold;
  }

  @Override
  public void setAmountOfGold(int amountOfGold) {
    this.amountOfGold = amountOfGold;
  }

  @Override
  public int getHealthPoint() {
    return healthPoint;
  }

  @Override
  public void setHealthPoint(int healthPoint) {
    this.healthPoint = healthPoint;
  }
}


