interface Searchable {
    PersonAbstract searchByName(String name);
}

public class UniversityLogBook implements Searchable {
    private StudentAbstract[] students;
    private FacultyAbstract[] facultyMembers;
    private int studentCount;
    private int facultyCount;

    public UniversityLogBook(int maxStudent, int maxFaculty) {
        students = new StudentAbstract[maxStudent];
        facultyMembers = new FacultyAbstract[maxFaculty];
        studentCount = 0;
        facultyCount = 0;
    }

    public void addStudent(StudentAbstract s) {
        if (studentCount < students.length) {
            students[studentCount++] = s;
            System.out.println("Student is added successfully");
        } else {
            System.out.println("Student cannot be added");
        }
    }

    public void addFaculty(FacultyAbstract f) {
        if (facultyCount < facultyMembers.length) {
            facultyMembers[facultyCount++] = f;
            System.out.println("Faculty is added successfully");
        } else {
            System.out.println("Faculty cannot be added");
        }
    }

    @Override
    public PersonAbstract searchByName(String name) {
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getName().equalsIgnoreCase(name)) { // fixed typo: equlasIgnoreCase -> equalsIgnoreCase
                return students[i];
            }
        }
        for (int i = 0; i < facultyCount; i++) {
            if (facultyMembers[i].getName().equalsIgnoreCase(name)) {
                return facultyMembers[i];
            }
        }
        System.out.println("Cannot find");
        return null;
    }

    public void editPerson(String name, String email, String department) {
        PersonAbstract p = searchByName(name);
        if (p != null) {
            p.setEmail(email);
            if (p instanceof StudentAbstract) {
                ((StudentAbstract) p).setMajor(department);
            } else if (p instanceof FacultyAbstract) {
                ((FacultyAbstract) p).setDepartment(department);
            }
            System.out.println("Information is updated");
        } else {
            System.out.println("Person cannot be found");
        }
    }

    public void removePerson(String name) {
        // Remove student
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getName().equalsIgnoreCase(name)) {
                for (int j = i; j < studentCount - 1; j++) { // fixed indexing
                    students[j] = students[j + 1];
                }
                students[--studentCount] = null;
                System.out.println("Removed the student");
                return;
            }
        }

        // Remove faculty
        for (int i = 0; i < facultyCount; i++) {
            if (facultyMembers[i].getName().equalsIgnoreCase(name)) {
                for (int j = i; j < facultyCount - 1; j++) { // fixed indexing
                    facultyMembers[j] = facultyMembers[j + 1];
                }
                facultyMembers[--facultyCount] = null;
                System.out.println("Removed the faculty");
                return;
            }
        }

        System.out.println("Person cannot be found");
    }

    public void displayAll() {
        System.out.println("---Students---");
        for (int i = 0; i < studentCount; i++) {
            System.out.println(students[i].getDetails());
        }

        System.out.println("---Faculty---");
        for (int i = 0; i < facultyCount; i++) {
            System.out.println(facultyMembers[i].getDetails());
        }
    }
}
