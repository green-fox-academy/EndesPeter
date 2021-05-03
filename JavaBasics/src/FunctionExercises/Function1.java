package FunctionExercises;

public class Function1 {
  public static void main(String[] args) {

    int baseNumber = 123;

    int result = doubleNumber(baseNumber);

    System.out.println(result);

  }

  public static int doubleNumber(int number) {
    int result = number * 2;
    return result;
  }
}