import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;


public class StudentManager {
    ArrayList<Student> studentList = new ArrayList<>();

    public void addStudent(Student s) {
        if (!studentList.contains(s)) {
            studentList.add(s);
            System.out.println("Student added: " + s.getName());
        } else {
            System.out.println("Student already exists!");
        }
    }

    public void removeStudent(String studentId) {
        Student found = findStudentById(studentId);
        if (found != null) {
            studentList.remove(found);
            System.out.println("Student removed: " + found.getName());
        } else {
            System.out.println("Student not found!");
        }
    }

    public Student findStudentById(String studentId) {
        for (Student s : studentList) {
            if (s.getStudentId().equals(studentId)) {
                return s;
            }
        }
        return null;
    }

    public void displayAllStudents() {
        Iterator<Student> it = studentList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public ArrayList<Student> getStudentsByYear(int year) {
        ArrayList<Student> result = new ArrayList<>();
        for (Student s : studentList) {
            if (s.getYear() == year) {
                result.add(s);
            }
        }
        return result;
    }

    public void sortStudentsByName() {
        Collections.sort(studentList, new Comparator<Student>() {
            public int compare(Student a, Student b) {
                return a.getName().compareTo(b.getName());
            }
        });

        System.out.println("Students sorted by name");
    }
}
