public class StudentAbstract extends PersonAbstract {
    protected String studentID;
    protected String major;

    // Fixed constructor parameter typo
    public StudentAbstract(String name, String email, String studentID, String major) {
        super(name, email);
        this.studentID = studentID;
        this.major = major;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    String getDetails() {
        return "Name: " + name +
               "\nID: " + studentID +
               "\nEmail: " + email +
               "\nMajor: " + major;
    }
}
