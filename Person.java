public class Person {
//private instance variables
  private String name;
  private int age;

//sets values to string name and int age
  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

/*getter method for the names of players */
  public String getName() {
    return name;
  }
  /*getter method for the ages of players */
  public int getAge() { 
    return age;
  }
//toString method to return in console
  public String toString() {
    return "Name: " + name + " - Age: " + age;
  }
  
}