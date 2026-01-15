public class Course {
    private String courseCode;
    private String courseName;
    private int credits;
    private int capacity;

    // Parameterized constructor
    public Course(String courseCode, String courseName, int credits, int capacity) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.credits = credits;
        this.capacity = capacity;
    }

    // Getters and Setters
    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    // toString()
    @Override
    public String toString() {
        return "Course Code: " + courseCode +
               ", Name: " + courseName +
               ", Credits: " + credits +
               ", Capacity: " + capacity;
    }

    // equals() based on courseCode
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        
        Course course = (Course) obj;
        return courseCode.equals(course.courseCode);
    }

    // hashCode() based on courseCode
    @Override
    public int hashCode() {
        return courseCode.hashCode();
    }
}

