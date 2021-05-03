package OOP2;

public class OOP2 {
  public static void main(String[] args) {


    Sharpies UsedOne = new Sharpies("Red", 15.5f);

    while (UsedOne.inkAmount > 0) {

      UsedOne.use();

      System.out.println(UsedOne.inkAmount);


    }
  }
}