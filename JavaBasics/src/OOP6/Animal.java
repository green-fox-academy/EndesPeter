package OOP6;

public class Animal {

  public int hunger = 50;
  public int thirst = 50;
  public int farmSize = 15;

  public void eat() {

    this.hunger -= 1;
  }

  public void drink() {
    this.thirst -= 1;
  }

  public void play() {
    this.hunger += 1;
    this.thirst += 1;
  }

  public void breed() {
    if (this.farmSize < 15) {
      farmSize ++;

    }

  }
}

  //    Every animal has a hunger value, which is a whole number
  //    Every animal has a thirst value, which is a whole number
  //    When creating a new animal instance these values must be set to the default 50 value
  //    Every animal can eat() which decreases its hunger by one
  //    Every animal can drink() which decreases its thirst by one
  //    Every animal can play() which increases both its hunger and thirst by one

