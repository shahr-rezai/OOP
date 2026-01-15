public class PersonTest {
  public static void main(String args[]){
    Person student = new Person("Ahmad", "Reza",22, true );
    boolean s= student.isAdult();
    System.out.println(s);
    System.out.println(student);

  }
  
}
