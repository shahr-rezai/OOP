import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class StudentManager {

    private ArrayList<Student> studentList = new ArrayList<>();

   
    public void addStudent(Student s) {
        if (s == null) throw new IllegalArgumentException("cannot add null student");
        studentList.add(s);
    }

    
    public boolean removeStudent(String studentId) {
        if (studentId == null || studentId.isEmpty()) return false;

        Iterator<Student> it = studentList.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            if (s.getStudentId().equals(studentId)) {
                it.remove();
                return true; 
            }
        }
        return false; // not found
    }

    // find student by ID, returns Student object or null
    public Student findStudentById(String studentId) {
        if (studentId == null) return null;

        for (Student s : studentList) {
            if (s.getStudentId().equals(studentId)) return s;
        }
        return null;
    }

    public void displayAllStudents() {
        for (Student s : studentList) System.out.println(s);
    }

    // get all students of a specific year
    public ArrayList<Student> getStudentsByYear(int year) {
        ArrayList<Student> result = new ArrayList<>();
        for (Student s : studentList) if (s.getYear() == year) result.add(s);
        return result;
    }

    // sort students alphabetically by name
    public void sortStudentsByName() {
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getName().compareToIgnoreCase(s2.getName());
            }
        });
    }
}
