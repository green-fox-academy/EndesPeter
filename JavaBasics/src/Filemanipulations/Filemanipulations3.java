package Filemanipulations;


import static java.nio.file.Files.*;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class Filemanipulations3 {
  public static void main(String[] args) throws IOException {


    Path myFile = Paths.get("my-file.txt");
    List<String> content = new ArrayList<>();
    content.add("First line of my file");
    System.out.println(content);


    // Write a function that is able to manipulate a file
    // by writing your name into it as a single line.
    // The file should be named "my-file.txt".
    // In case the program is unable to write the file,
    // it should print the following error message: "Unable to write file: my-file.txt".

  }


}


