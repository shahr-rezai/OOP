package finalExam;

import java.util.ArrayList;
import java.util.HashSet;

class Student extends User {
    private String department;

    static ArrayList<Student> studentsList = new ArrayList<>();
    static HashSet<String> studentIds = new HashSet<>();

    public Student(String userId, String userName) {
        super(userId, userName);
    }

    public void addDepartment(String dept){
        this.department = dept;
    }

    @Override
    String getRole(){
        return "Student";
    }

    public void displayStudentInfo(){
        System.out.println("ID: " + getUserId() + ", Name: " + getUserName() + ", Department: " + department);
    }

    public static void addStudent(Student s) throws DuplicatedIdException {
        if(studentIds.contains(s.getUserId())){
            throw new DuplicatedIdException("Student ID already exists");
        } else {
            studentsList.add(s);
            studentIds.add(s.getUserId());
            System.out.println("Student added successfully.");
        }
    }

    public static Student findStudent(String id){
        for(Student s: studentsList){
            if(s.getUserId().equals(id)) return s;
        }
        return null;
    }
}