package ExerciseII;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class MostCommonChar {

  public static void main(String[] args) {


    Path sampleFile = Paths.get("countchar.txt");
    List<String> addedFile = new ArrayList<>();
    try {
      addedFile = Files.readAllLines(sampleFile);
    } catch (IOException e) {
      e.printStackTrace();
      System.out.println("File can not be found");
    }

    public char findMostCommon () {

      for (int i = 0; i < addedFile.size(); i++) {


      }


    }

  }
}
