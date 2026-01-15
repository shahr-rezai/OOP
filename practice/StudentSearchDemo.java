import java.util.ArrayList;

public class StudentSearchDemo{
  

  public static Student findById(ArrayList<Student> students, String id ){

    for(Student s : students){
      if(s.getId().equalsIgnoreCase(id)){
        return s;
      }
    }
    return null;

  }

  public static Student findStudentByName(ArrayList<Student> students, String name){
    for(Student s: students){
      if(s.getName().equalsIgnoreCase(name)){
        return s;
      }
    }
    return null;
  }

  public static void main(String [] args){
    ArrayList<Student> students = new ArrayList<Student>();
    students.add(new Student("Alice", "S001", "Computer Science") );
    students.add(new Student("Bob", "S002", "Engineering"));
    students.add(new Student("Charlie", "S003", "Mathematics"));

    for(Student s : students){
      System.out.println(s);
    }

    String searchId = "S002";
    Student foundById = findById(students, searchId);
    if(foundById !=null){
      System.out.println("Found by ID "+ searchId + ": "+foundById);
    }
    else{
      System.out.println("No Student with that ID");
    }

    String searchName = "Alice";
    Student foundByName = findStudentByName(students, searchName);
    if(foundByName != null){
      System.out.println("found by Name " +searchName + ": "+foundByName);

    }
    else{
      System.out.println("Not found this name");
    }

  }
}

