
import java.util.Scanner;

public class DataRunner {
  public static void main(String[] args) {
// instantiates users for userstory and roster
    UserStory us = new UserStory("names.txt", "ages.txt");
    Roster m = new Roster("names.txt");
    //system.out.println to print out the text in the chat
    System.out.println("Average age for pro soccer players: " + us.calcAverageAge());
    System.out.println("Total Players: " + m.calcTotalPeople());
    // Use toString() method to print out all people
    System.out.println(us);


  }
}