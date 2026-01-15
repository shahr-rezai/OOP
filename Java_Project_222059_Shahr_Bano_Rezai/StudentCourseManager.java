import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class StudentCourseManager {

    
    private HashMap<Student, List<Course>> enrollmentMap = new HashMap<>();

    // Enroll a student in a course
    public void enrollStudentInCourse(Student s, Course c) {
        if (s == null || c == null) return;  // skip null inputs

        // If student is not already in the map, add them with a new list
        if (!enrollmentMap.containsKey(s)) {
            enrollmentMap.put(s, new ArrayList<>());
        }

        // Add the course to the student's course list
        enrollmentMap.get(s).add(c);
    }

    
    public List<Course> getStudentCourses(Student s) {
        return enrollmentMap.getOrDefault(s, new ArrayList<>());
    }

    // Drop a specific course for a student
    public void dropCourse(Student s, Course c) {
        if (s == null || c == null) return; // skip nulls
        if (enrollmentMap.containsKey(s)) {
            enrollmentMap.get(s).remove(c);
        }
    }

    // Get total number of enrollments 
    public int getTotalEnrollments() {
        int total = 0;
        for (List<Course> courses : enrollmentMap.values()) {
            total += courses.size();
        }
        return total;
    }

    // Display all enrollments
    public void displayAllEnrollments() {
        for (Map.Entry<Student, List<Course>> entry : enrollmentMap.entrySet()) {
            System.out.println(entry.getKey() + " is enrolled in:");
            for (Course c : entry.getValue()) {
                System.out.println("   " + c);
            }
            System.out.println();
        }
    }

    
    public List<Student> getStudentsInCourse(Course course) {
        List<Student> result = new ArrayList<>();
        if (course == null) return result; // skip null

        for (Map.Entry<Student, List<Course>> entry : enrollmentMap.entrySet()) {
            if (entry.getValue().contains(course)) {
                result.add(entry.getKey());
            }
        }
        return result;
    }
}
