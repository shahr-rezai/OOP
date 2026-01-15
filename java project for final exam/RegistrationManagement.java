package finalExam;

import java.util.ArrayList;
import java.util.HashMap;

class RegistrationManagement {
    static HashMap<String, ArrayList<String>> registrations = new HashMap<>();

    public static void registerStudent(String studentId, String courseCode) throws StudentNotFoundException, CourseNotFoundException, CourseFullException {
        Student student = Student.findStudent(studentId);
        Course course = Course.findCourse(courseCode);

        if(student == null) throw new StudentNotFoundException("Student ID not found");
        if(course == null) throw new CourseNotFoundException("Course code not found");
        if(course.isFull()) throw new CourseFullException("Course is full");

        ArrayList<String> courses = registrations.getOrDefault(studentId, new ArrayList<>());
        if(courses.contains(courseCode)){
            System.out.println("Already registered");
        } else {
            courses.add(courseCode);
            registrations.put(studentId, courses);
            course.incrementSeat();
            System.out.println("Registration successful");
        }
    }

    public static void dropCourse(String studentId, String courseCode) throws StudentNotFoundException, CourseNotFoundException {
        Student student = Student.findStudent(studentId);
        Course course = Course.findCourse(courseCode);

        if(student == null) throw new StudentNotFoundException("Student not found");
        if(course == null) throw new CourseNotFoundException("Course not found");

        ArrayList<String> courses = registrations.get(studentId);
        if(courses == null || !courses.contains(courseCode)){
            System.out.println("Error: Not registered in this course");
        } else {
            courses.remove(courseCode);
            course.decrementSeat();
            System.out.println("Course dropped successfully");
        }
    }
}