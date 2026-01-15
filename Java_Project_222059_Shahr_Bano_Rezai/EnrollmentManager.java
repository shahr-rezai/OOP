import java.util.HashSet;

public class EnrollmentManager {

    private HashSet<Student> activeStudents = new HashSet<>();

    // enroll student
    public void enrollStudent(Student s) {
        if (s == null) throw new IllegalArgumentException("cannot enroll null student");
        activeStudents.add(s);  // duplicates automatically prevented
    }

    // withdraw student
    public void withdrawStudent(Student s) {
        if (s != null) activeStudents.remove(s);
    }

    // check if student is active by ID
    public boolean isStudentActive(String studentId) {
        if (studentId == null || studentId.isEmpty()) return false;

        for (Student s : activeStudents) {
            if (s.getStudentId().equals(studentId)) return true;
        }
        return false;
    }

    // number of active students
    public int getActiveStudentCount() {
        return activeStudents.size();
    }

    // remove all students
    public void clearAllEnrollments() {
        activeStudents.clear();
    }

    // convert to array
    public Student[] convertToArray() {
        Student[] arr = new Student[activeStudents.size()];
        int index = 0;
        for (Student s : activeStudents) {
            arr[index++] = s;
        }
        return arr;
    }

    // display active students
    public void displayActiveStudents() {
        for (Student s : activeStudents) {
            System.out.println(s);
        }
    }
}
