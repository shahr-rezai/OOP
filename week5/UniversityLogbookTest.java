public class UniversityLogbookTest {
  public static void main(String[] args) {
    UniversityLogbook logbook = new UniversityLogbook();
    logbook.addStudent(new Student("Alice", "alice@mail.com", "S001", "CS"));
    logbook.addFaculty(new Faculty("Dr. Bob", "bob@uni.com", "F001", "Math"));

    logbook.displayAll();

    logbook.editPerson("Alice", "alice@kabul.java");

    Person p = logbook.searchByName("Alice");
    if (p != null) System.out.println("Found: " + p.getDetails());

    logbook.removePerson("Dr.Bob");
    
    logbook.displayAll();
  
    
  }
  
}
