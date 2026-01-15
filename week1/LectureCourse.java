public class LectureCourse extends CourseBase {

    private int lectureHour;

    public LectureCourse() {
        this("mainCourse", "mainCourse", 0);
    }

    public LectureCourse(int lectureHour) {
        this("mainCourse", "mainCourse", lectureHour);
    }

    public LectureCourse(String courseName, String courseCode, int lectureHour) {
        super(courseName, courseCode);
        this.lectureHour = lectureHour;
    }

    public int getLectureHour() {
        return lectureHour;
    }

    public void setLectureHour(int lectureHour) {
        this.lectureHour = lectureHour;
    }
    
    @Override
    public int getTotalHours() {
        return lectureHour;
    }


    @Override
    public String toString() {
        return "Course Name: " + getCourseName() +
               ", Code: " + getCourseCode() +
               ", Hour: " + lectureHour;
    }
}
