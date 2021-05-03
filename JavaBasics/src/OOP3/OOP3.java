package OOP3;

public class OOP3 {

  public static void main(String[] args) {


    Teacher teacher = new Teacher("teach", "giveAnswer");
    Student student = new Student("LEARN", "question");


    student.ask();
    teacher.teach();

  }
}
