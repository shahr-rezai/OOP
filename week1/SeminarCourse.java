public class SeminarCourse extends LectureCourse {

    private String guestSpeaker;

    public SeminarCourse() {
        this("mainCourse", "mainCourse", 0, "mainCourse");
    }

    public SeminarCourse(String guestSpeaker) {
        this("mainCourse", "mainCourse", 0, guestSpeaker);
    }

    public SeminarCourse(String courseName, String courseCode, int lectureHour, String guestSpeaker) {
        super(courseName, courseCode, lectureHour);
        this.guestSpeaker = guestSpeaker;
    }

    // Proper getter
    public String getGuestSpeaker() {
        return guestSpeaker;
    }

    public void setGuestSpeaker(String guestSpeaker) {
        this.guestSpeaker = guestSpeaker;
    }

    @Override
    public int getTotalHours() {
        // Use parent's getter instead of private variable
        return getLectureHour();
    }

    @Override
    public String toString() {
        return super.toString() + ", Guest Speaker: " + guestSpeaker;
    }
}
