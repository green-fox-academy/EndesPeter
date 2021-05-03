package Strings;


public class String6 {

  public static void main(String... args) {
    String toBeReversed =
        ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

    String result = "";
    for (int i = 0; i < toBeReversed.length(); i++) {
      int lastInputIndex = toBeReversed.length() - (i + 1);
      char value = toBeReversed.charAt(lastInputIndex);
      result += value;


      // Create a method that can reverse a String which is passed as parameter
      // Pass the toBeReversed variable to this method to check if it works well
      // Solve this task using charAt() function first
      // Try other solutions when you are done


    }
    System.out.println(result);

  }


}