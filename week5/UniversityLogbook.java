import java.util.ArrayList;

interface Searchable{
  Person searchByName(String name);
}

public class UniversityLogbook implements Searchable{
  
  private ArrayList<Student> students = new ArrayList<>();
  private ArrayList<Faculty> faculties = new ArrayList<>();
  
  public void addStudent(Student s){
    students.add(s);
    System.out.println("Student added: "+ s.getName());
  }

  public void addFaculty(Faculty f){
    faculties.add(f);
    System.out.println("Faculty added: " + f.getName());
  }
  @Override
  public Person searchByName (String name){

    for (Student s: students){
      if(s.getName().equalsIgnoreCase(name)){
        return s;
      }
    }

    for (Faculty f: faculties){
      if(f.getName().equalsIgnoreCase(name));{
      return f;
      }
    }
  

    return  null;
    
  
  }
  public void editPerson(String name, String newEmail){
    Person p = searchByName(name);
    if(p != null){
        p.setEmail(newEmail);
        System.out.println("Updated email for: "+ p.getName());

    }
    else{
      System.out.println("Person not found. ");
    }
   
  }

  public void removePerson(String name){
    Person p =searchByName(name);
    if(p instanceof Student){
      students.remove(p);
      System.out.println("Student removed: "+ p.getName());

    }
    else if (p instanceof Faculty){
      faculties.remove(p);
      System.out.println("faculty removed: "+p.getName());

    }
    else{
      System.out.println("Person not found");
    }
  }
  public void displayAll(){
    System.out.println("=== Students ===");
    for(Student s: students){
      System.out.println(s.getDetails());
    }

    System.out.println("\n=== Faculty ===");
    for (Faculty f : faculties) {
        System.out.println(f.getDetails());
    }
  }


  
}
