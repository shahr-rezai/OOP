public class DemoLogBook{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    UniversityLogBook logBook = new UniversityLogBook(50, 50);
    int choice;
    do{
      System.out.println("University Logbook");
      System.out.println("1: Add Student");
      System.out.println("2: Add Faculty");
      System.out.println("3: Search Person");
      System.out.println("4: Edit Person");
      System.out.println("5: Remove Person");
      System.out.println("6: Displayt all");
      System.out.println("7: Exit");
      System.out.println("Enter your choice: ");
      choice = in.nextInt();
      switch(choice){
        case 1:
        String name = in.nextLine()
        String ID = in.nextLine()
        String email=in.nextLine()
        String department=in.nextLine()
        StudentAbstract s=new StudentAbstract(name, ID, email, department);
        Logbook.addStudent(s);
        break;
        case 2:
        String fname = in.nextLine()
        String fID = in.nextLine()
        String femail=in.nextLine()
        String fdepartment=in.nextLine()
        FacultyAbstract f=new FacultyAbstract(fname, fID, femail, fdepartment);
        Logbook.addFaculty(f);
        break;
        Case 3:
        String search_name=in.nextLine();
        PersonAbstract p=logBook.searchByName(search_name);

      }
    } while(choice!=7);

  }
}