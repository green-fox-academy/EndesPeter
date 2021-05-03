package OOP3;

public class Student {

  String learn;
  String question;


  Student(String learn, String question) {
    this.learn = "The student is actually learning";
    this.question = ask();
  }

  public void learn() {
    System.out.println(learn);

  }

  public String ask() {
    System.out.println("Ask the teacher");


    return null;
  }
}
