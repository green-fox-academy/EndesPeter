package Filemanipulations;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.List;

public class Filemanipulations2 {


  public static void main(String[] args) {


    Path filepath = Paths.get("my-file.txt");
    List<String> lines = null;
    lines = filereader(filepath, lines);

    System.out.println(lines);

    // Write a program that opens a file called "my-file.txt" and prints each
    // line from the file.
    // If the program is unable to read the file (for example the file does not exist),
    // it should print the following error message: "Unable to read file: my-file.txt".

  }

  private static List<String> filereader(Path filepath, List<String> lines) {
    try {
      lines = Files.readAllLines(filepath);
    } catch (IOException e) {

      System.out.println("Unable to read file: my-file.txt");
    }
    return lines;


  }


}
