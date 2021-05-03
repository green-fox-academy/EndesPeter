package Strings;

public class String4 {

  public static void main(String[] args) {

    String todoText = " - Buy milk\n";

    StringBuilder sb = new StringBuilder();
    sb.append("My todo:");
    sb.append(todoText);
    sb.append("Download Games ");
    sb.append("Diabolo");

    //    My todo:
    //  - Buy milk
    //  - Download games
    //  - Diablo

    System.out.println(sb.toString());


  }


}
