package finalExam;

import java.util.HashMap;

class Course {
    private String courseCode;
    private String courseName;
    private int seatLimit;
    private int currentSeats;

    static HashMap<String, Course> coursesMap = new HashMap<>();

    public Course(String courseCode, String courseName, int seatLimit){
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.seatLimit = seatLimit;
        this.currentSeats = 0;
    }

    public String getCourseCode() { return courseCode; }
    public String getCourseName() { return courseName; }
    public int getSeatLimit() { return seatLimit; }
    public int getCurrentSeats() { return currentSeats; }

    public boolean isFull(){ return currentSeats >= seatLimit; }
    public void incrementSeat(){ currentSeats++; }
    public void decrementSeat(){ currentSeats--; }

    public static void addCourse(Course c) throws DuplicateCourseException {
        if(coursesMap.containsKey(c.getCourseCode())){
            throw new DuplicateCourseException("Course code already exists");
        } else {
            coursesMap.put(c.getCourseCode(), c);
            System.out.println("Course added successfully.");
        }
    }

    public static Course findCourse(String code){
        return coursesMap.get(code);
    }
}