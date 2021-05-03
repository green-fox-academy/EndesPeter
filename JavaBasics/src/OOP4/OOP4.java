package OOP4;

import java.sql.SQLOutput;
import javax.sound.midi.Soundbank;

public class OOP4 {


  public static void main(String[] args) {

    PostIt Idea1 = new PostIt("orange", "Idea1", "orange");
    PostIt Awesome = new PostIt("pink", "Awesome", "black");
    PostIt Superb = new PostIt("yellow", "Superb", "green");



    System.out.println(Idea1.textColor);
    Idea1.print();


  }
}
