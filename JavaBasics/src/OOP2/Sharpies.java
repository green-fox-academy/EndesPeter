package OOP2;

public class Sharpies {

  String color;
  float width;
  float inkAmount;

  Sharpies(String color, float width) {
    this.color = color;
    this.width = width;
    inkAmount = 100;

  }


  public void use() {
    this.inkAmount -= 10;

  }


  /*We should know the followings about each sharpie:
  color (which should be a string),
  width (which will be a floating point number) and the
  inkAmount (another floating point number)
  We need to specify the color and the width at creation
  Every sharpie is created with a default inkAmount value: 100
  We can use() the sharpie objects: using it decreases inkAmount by 10*/


}
