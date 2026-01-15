public class LabCourse extends LectureCourse {

    public LabCourse() {
        this("mainCourse", "mainCourse", 0);
    }

    public LabCourse(int hours) {
        this("mainCourse", "mainCourse", hours);
    }

    public LabCourse(String courseName, String courseCode, int hours) {
        super(courseName, courseCode, hours);
    }

    @Override
    public int getTotalHours() {
        // use parent's getter
        return getLectureHour();  
    }

    @Override
    public String toString() {
        return super.toString() + ", Lab Hours: " + getLectureHour();
    }
}
