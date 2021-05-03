package ArrayExercises;

public class Array7 {

  public static void main(String[] args) {


    String[][] colors =
        {{"*", "*", "*", "*", "*"}, {"*", "*", "*", "*", "*"}, {"*", "*", "*", "*", "*"},
            {"*", "*", "*", "*", "*"}, {"*", "*", "*", "*", "*"}};

    Nyomtatas(colors);

  }

  private static void Nyomtatas(String[][] colors) {
    for (int i = 0; i < colors.length; i++) {
      for (int j = 0; j < colors[i].length; j++) {
        System.out.print(colors[i][j] + "   ");
      }

      System.out.println();
    }
  }
}





