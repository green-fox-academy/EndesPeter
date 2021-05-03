package Practice;


import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Spliterator;

public class Practice {

  public static void main(String[] args) throws IOException {

    Path Endes = Paths.get("my-file.txt");

    List<String> Peter = new ArrayList<>();

    Peter = Files.readAllLines(Endes);



      System.out.println(Peter);





/*    System.out.println();

    HashMap<String, String> Endesp = new HashMap<>();
    Endesp.put("45", "Endes");
    Endesp.put("35", "Hankesz");

    System.out.println(Endesp);

    System.out.println();

    List <String> Endespeter= new ArrayList<>();
    Endespeter.add(0, "Petike");
    Endespeter.add(1, "Delike");

    Endespeter.remove("Petike");
    System.out.println(Endespeter);

    System.out.println();

    String[] Delike = new String [5];
    Delike[0] = "PEti";
    Delike[1] = "Endes";
    Delike[2] = "Hankesz";

    for (int i = 0; i < Delike.length; i++) {
      System.out.println(Delike[i]);
    }

*/


  }
}





