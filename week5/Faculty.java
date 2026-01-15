class Faculty extends Person {
    private String facultyId;
    private String department;

    public Faculty(String name, String email, String facultyId, String department) {
        super(name, email);
        this.facultyId = facultyId;
        this.department = department;
    }

    @Override
    public String getDetails() {
        return "Faculty: " + getName() + ", Email: " + getEmial() +
               ", ID: " + facultyId + ", Department: " + department;
    }
}
