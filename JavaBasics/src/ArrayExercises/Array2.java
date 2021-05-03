package ArrayExercises;

public class Array2 {

  public static void main(String[] args) {


    int[] first = new int[] {1, 2, 3};

    int[] second = new int[] {4, 5, 6, 8, 9};

    int arrayLength1 = first.length;
    int arrayLength2 = second.length;


    if (arrayLength1 < arrayLength2) {
      System.out.println("First array is shorter than the second one");
    }
    else {
      System.out.println("Second array is shorter");
    }
    if (arrayLength1 == 2 && arrayLength2 == 5) {
      System.out.println("farkaskutya");

    } else if (arrayLength1 == 4 || arrayLength2 == 5) {
      System.out.println("pincsi");

    } else {
      System.out.println("frakk");
    }
  }
}
