package practice;

public class CourseBaseTest {
  public static void main(String[] args){
    CourseBase[] courses = new CourseBase[3];
    courses[0] = new LectureCourse("Linear Algebra", "CS2001", 2);
    courses[1] = new SeminarCourse("UG Seminar", "GE3000", 4, "Sabrina Noishin");
    courses[2] = new LabCourse("DBMS", "CS2003", 4); 

        for (CourseBase c : courses){
          System.out.println(c);
          System.out.println("Total Hours: "+c.getTotalHours());
          System.out.println();
        }
  }
  
}
