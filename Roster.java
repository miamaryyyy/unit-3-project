public class Roster {
  //1D array called rosterNames
private String[] rosterNames;

/*FileReader.toStringArray which gets the information from the files*/
    public Roster(String filename) {
    this.rosterNames = FileReader.toStringArray(filename);
  }

/*Calcolate total people method to find the total amount of players in the data set */
public int calcTotalPeople() {

  return rosterNames.length;
  }

}