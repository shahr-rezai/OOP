public class Student extends Person {
  String studentId;
  String major;

  public Student (String name, String email, String studentId, String major){
    super(name, email);
    this.studentId=studentId;
    this.major=major;
  }

  @Override
  public String getDetails(){
    return "Student "+ getName() + ", Email: "+ getEmial() + 
    ", ID: " +studentId+ ", Major"+major;
  }
  
}
