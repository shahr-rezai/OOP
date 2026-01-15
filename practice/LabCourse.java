package practice;

public class LabCourse extends LectureCourse{
  public LabCourse(String courseName, String courseCode, int hours){
    super(courseName, courseCode, hours);

  }
  @Override
  public int getTotalHours(){
    return getLectureHour();
}
}
