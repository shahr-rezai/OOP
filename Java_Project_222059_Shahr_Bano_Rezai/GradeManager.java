import java.util.Map;
import java.util.TreeMap;

public class GradeManager {

    // key for student-course pair
    public static class StudentCourseKey implements Comparable<StudentCourseKey> {
        private String studentId;
        private String courseCode;

        public StudentCourseKey(String studentId, String courseCode) {
            this.studentId = studentId;
            this.courseCode = courseCode;
        }

        public String getStudentId() {
            return studentId;
        }

        public String getCourseCode() {
            return courseCode;
        }

        @Override
        public int compareTo(StudentCourseKey other) {
            int cmp = this.studentId.compareTo(other.studentId);
            if (cmp != 0) return cmp;
            return this.courseCode.compareTo(other.courseCode);
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (!(obj instanceof StudentCourseKey)) return false;
            StudentCourseKey key = (StudentCourseKey) obj;
            return studentId.equals(key.studentId) && courseCode.equals(key.courseCode);
        }

        @Override
        public int hashCode() {
            return studentId.hashCode() * 31 + courseCode.hashCode();
        }

        @Override
        public String toString() {
            return studentId + " - " + courseCode;
        }
    }

    private TreeMap<StudentCourseKey, Double> gradeBook = new TreeMap<>();

    // assign a grade (null check only)
    public void assignGrade(String studentId, String courseCode, double grade) {
        if (studentId == null || courseCode == null) return;  // skip bad input
        gradeBook.put(new StudentCourseKey(studentId, courseCode), grade);
    }

    // get grade (null check)
    public double getGrade(String studentId, String courseCode) {
        if (studentId == null || courseCode == null) return -1.0;
        return gradeBook.getOrDefault(new StudentCourseKey(studentId, courseCode), -1.0);
    }

    // compute GPA
    public double getStudentGPA(String studentId) {
        if (studentId == null) return 0.0;

        double total = 0;
        int count = 0;
        for (Map.Entry<StudentCourseKey, Double> entry : gradeBook.entrySet()) {
            if (entry.getKey().getStudentId().equals(studentId)) {
                total += entry.getValue();
                count++;
            }
        }
        return count > 0 ? total / count : 0.0;
    }

    // all grades for student
    public void getAllGradesForStudent(String studentId) {
        if (studentId == null) return;
        System.out.println("Grades for student " + studentId + ":");
        for (Map.Entry<StudentCourseKey, Double> entry : gradeBook.entrySet()) {
            if (entry.getKey().getStudentId().equals(studentId)) {
                System.out.println(entry.getKey().getCourseCode() + " -> " + entry.getValue());
            }
        }
    }

    // highest grade
    public double getHighestGrade() {
        double max = -1;
        for (double grade : gradeBook.values()) {
            if (grade > max) max = grade;
        }
        return max;
    }

    // show all grades
    public void displayGradesSorted() {
        System.out.println("All grades (sorted by studentId and courseCode):");
        for (Map.Entry<StudentCourseKey, Double> entry : gradeBook.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
