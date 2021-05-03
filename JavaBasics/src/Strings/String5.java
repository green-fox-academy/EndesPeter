package Strings;


public class String5 {

  public static void main(String... args) {
    String toBeReversed =
        ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

    // Create a method that can reverse a String which is passed as parameter
    // Pass the toBeReversed variable to this method to check if it works well
    // Solve this task using charAt() function first
    // Try other solutions when you are done

    System.out.println(reversed(toBeReversed));
  }


  public static String reversed(String input) {
    String result = "";
    for (int i = 0; i < input.length(); i++) {
      int lastInputIndex = input.length() - (i + 1);
      char value = input.charAt(lastInputIndex);
      result += value;

    }
    return result;
  }


}

