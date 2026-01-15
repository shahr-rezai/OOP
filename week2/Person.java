public class Person {
  String firstName;
  String lastName;
  int age;
  boolean isStudent;
  public Person(String firstName, String lastName, int age, boolean isStudent ){
    this.firstName=firstName;
    this.lastName=lastName;
    this.age=age;
    this.isStudent=isStudent;
  }
  public boolean isAdult() {
    if (age>=18){
      return true;
    }
    else{
      return false;
    }

  }
@Override
public String toString() {
    return firstName + " with the last name " + lastName +
           " is a student: " + isStudent + " of age " + age;
}
}


