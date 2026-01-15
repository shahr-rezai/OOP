public class Student {

    private String studentId;
    private String name;
    private String email;
    private int year;

    // just checking id here so I don't break things later
    public Student(String studentId, String name, String email, int year) {
        if (studentId == null || studentId.isEmpty()) {
            throw new IllegalArgumentException("student id missing");
        }
        this.studentId = studentId;
        this.name = name;
       	this.email = email;
        this.year = year;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId; // no extra checks needed here
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name; 
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return studentId + " - " + name + " - " + email + " - Year " + year;
    }

    // checking by ID only
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Student)) return false;
        Student s = (Student) obj;
        return this.studentId.equals(s.studentId);
    }

    @Override
    public int hashCode() {
        return studentId.hashCode();
    }
}
