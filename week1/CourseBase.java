public class CourseBase {

    private String courseName;
    private String courseCode;

    public CourseBase() {
        this("mainCourse", "mainCourse");  // default values
    }

    public CourseBase(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public int getTotalHours() {
        return 0;
    }

    @Override
    public String toString() {
        return "Course Name: " + courseName + ", Code: " + courseCode;
    }
}
