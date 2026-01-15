public class FacultyAbstract extends PersonAbstract {
    private String facultyID;
    private String department;

    // Fixed constructor name
    public FacultyAbstract(String name, String email, String facultyID, String department) {
        super(name, email);
        this.facultyID = facultyID;
        this.department = department;
    }

    public String getFacultyID() {
        return facultyID;
    }

    // Fixed setter name
    public void setFacultyID(String facultyID) {
        this.facultyID = facultyID;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    String getDetails() {
        return "Name: " + name +
               "\nID: " + facultyID +
               "\nEmail: " + email +
               "\nDepartment: " + department;
    }
}
