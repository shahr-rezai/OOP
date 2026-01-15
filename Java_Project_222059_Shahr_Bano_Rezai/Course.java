public class Course implements Comparable<Course> {

    private String courseCode;
    private String courseName;
    private int credits;
    private int capacity;

    // just making sure courseCode is not empty
    public Course(String courseCode, String courseName, int credits, int capacity) {
        if (courseCode == null || courseCode.isEmpty()) {
            throw new IllegalArgumentException("course code missing");
        }
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.credits = credits;
        this.capacity = capacity;
    }

    public String getCourseCode() {
        return courseCode;
    }

    // no strict check here, main constructor already handled it
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

    @Override
    public String toString() {
        return courseCode + " - " + courseName + " (Credits: " + credits + ", Cap: " + capacity + ")";
    }

    // comparing based on code only 
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Course)) return false;
        Course c = (Course) obj;
        return this.courseCode.equals(c.courseCode);
    }

    @Override
    public int hashCode() {
        return courseCode.hashCode();
    }

    // for sorting
    @Override
    public int compareTo(Course other) {
        return this.courseCode.compareTo(other.courseCode);
    }
}
