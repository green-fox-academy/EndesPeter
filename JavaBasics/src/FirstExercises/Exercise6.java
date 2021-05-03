package FirstExercises;

public class Exercise6 {
  public static void main(String[] args) {
    // An average Green Fox attendee codes 6 hours daily
    // The semester is 17 weeks long

    // Print how many hours is spent with coding in a semester by an attendee,
    // if the attendee only codes on workdays.
    //
    // Print the percentage of the coding hours in the semester if the average
    // work hours weekly is 52

    int workingHours = 6;
    int weeks = 17;
    int totalDays = (weeks * 7);
    int workdays = (totalDays / 7) * 5;
    int workdaysPerWeek = 5;
    int totalWorkingHours = (workdays * 6);
    int totalWorkdays = (workdays * weeks);
    int averageWorkingHoursPerWeek = 52;
    int attendeeWorkingHoursPerWeek = (workingHours * workdaysPerWeek);


    System.out.println("Hours spent coding per week by attendee");
    System.out.println(workdays * workingHours);
    System.out.println("Average coding hours per semester compared to a 52hours per week");
    System.out.println(new StringBuilder()
        .append((float) attendeeWorkingHoursPerWeek / averageWorkingHoursPerWeek * 100).append("%")
        .toString());
  }


}
