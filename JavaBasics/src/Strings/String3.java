package Strings;

import java.util.Arrays;

public class String3 {


  public static void main(String... args) {
    String quote =
        "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
    StringBuilder sb = new StringBuilder();
    sb.append("always take longer than ");
    System.out.println(
        "It " + sb.toString() + "you expect, even when you take into account Hofstadter's Law.");

//    String s123 = "";
    // Insert the words "always takes longer than" between the words "It" and "you" using the StringBuilder class!
    // Use pieces of the quote variable (instead of just redefining the string)!


  }

}
