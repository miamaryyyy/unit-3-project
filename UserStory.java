
import java.util.Scanner;

public class UserStory {

  private Person[] people;
  
  public UserStory(String namesFile, String agesFile) {
    this.people = createPeople(namesFile, agesFile);
  }

/*1D arrays for name and age. Creates a person for each pair of names and age */
  public Person[] createPeople(String namesFile, String agesFile) {
    String[] names = FileReader.toStringArray(namesFile);
    int[] ages = FileReader.toIntArray(agesFile);
    Person[] peopleArray = new Person[names.length];
    for (int i = 0; i < names.length; i++) {
      peopleArray[i] = new Person(names[i], ages[i]);
    }
    return peopleArray;
  }

  // other methods


/*toString method to print out information in a readable way */
  public String toString() {
    String result = "Example People:\n";
    for (Person person : people) {
      result += person + "\n";
    }
    return result;
  }

/*Calculate average age method to find average ages of players */
 public int calcAverageAge() {
    int total = 0;
        
    for (Person m : people) {
      total += m.getAge();
    }

    return total / people.length;
  }


}

