import java.util.*;

public class CourseManagementSystemTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Managers
        StudentManager studentManager = new StudentManager();
        CourseCatalog courseCatalog = new CourseCatalog();
        CourseOfferings courseOfferings = new CourseOfferings();
        EnrollmentManager enrollmentManager = new EnrollmentManager();
        StudentCourseManager studentCourseManager = new StudentCourseManager();
        GradeManager gradeManager = new GradeManager();
        WaitlistManager waitlistManager = new WaitlistManager();

        // Pre-fill students
Student s1 = new Student("AUW222059", "Marzia", "marzia@gmail.com", 2);
Student s2 = new Student("AUW222060", "Sahar", "sahar@gmail.com", 3);
Student s3 = new Student("AUW222061", "Kobra", "kobra@gmail.com", 2);
Student s4 = new Student("AUW222062", "Hafsa", "hafsa@gmail.com", 1);
Student s5 = new Student("AUW222063", "Ali", "ali@gmail.com", 4);

studentManager.addStudent(s1);
studentManager.addStudent(s2);
studentManager.addStudent(s3);
studentManager.addStudent(s4);
studentManager.addStudent(s5);

// Pre-fill courses
Course c1 = new Course("CSC101", "Introduction to Programming", 3, 2); // small capacity to test waitlist
Course c2 = new Course("CSC201", "Data Structures", 4, 3);
Course c3 = new Course("CSC305", "Database Systems", 3, 2);
Course c4 = new Course("CSC401", "Software Engineering", 4, 3);

courseCatalog.addCourseAtEnd(c1);
courseCatalog.addCourseAtEnd(c2);
courseCatalog.addCourseAtEnd(c3);
courseCatalog.addCourseAtEnd(c4);

courseOfferings.addCourse(c1);
courseOfferings.addCourse(c2);
courseOfferings.addCourse(c3);
courseOfferings.addCourse(c4);

// Pre-fill enrollments (some courses full)
enrollmentManager.enrollStudent(s1);
enrollmentManager.enrollStudent(s2);
enrollmentManager.enrollStudent(s3);
enrollmentManager.enrollStudent(s4);
enrollmentManager.enrollStudent(s5);

studentCourseManager.enrollStudentInCourse(s1, c1);
studentCourseManager.enrollStudentInCourse(s2, c1); // c1 now full
studentCourseManager.enrollStudentInCourse(s3, c2);
studentCourseManager.enrollStudentInCourse(s4, c2);
studentCourseManager.enrollStudentInCourse(s5, c3);

// Pre-fill grades
gradeManager.assignGrade(s1.getStudentId(), c1.getCourseCode(), 3.7);
gradeManager.assignGrade(s2.getStudentId(), c1.getCourseCode(), 4.0);
gradeManager.assignGrade(s3.getStudentId(), c2.getCourseCode(), 3.5);
gradeManager.assignGrade(s4.getStudentId(), c2.getCourseCode(), 3.9);
gradeManager.assignGrade(s5.getStudentId(), c3.getCourseCode(), 4.0);

// Pre-fill waitlist for CSC101
waitlistManager.addToWaitlist(s3, 1); // wants CSC101
waitlistManager.addToWaitlist(s4, 1);


        int choice;

        do {
            try {
                System.out.println("\n=== University Course Management System ===");
                System.out.println("1. Add/Remove Student");
                System.out.println("2. Add/Remove Course");
                System.out.println("3. Enroll/Withdraw Student in Course");
                System.out.println("4. Assign/Get Grades");
                System.out.println("5. Display Student Transcript");
                System.out.println("6. Display Course Roster");
                System.out.println("7. Manage Waitlist");
                System.out.println("8. Display Active Enrollments");
                System.out.println("9. Display All Grades for a Student");
                System.out.println("10. Calculate Course GPA");
                System.out.println("0. Exit");
                System.out.print("Enter your choice: ");
                choice = Integer.parseInt(sc.nextLine());

                switch (choice) {
                    case 1:
                        manageStudents(sc, studentManager);
                        break;
                    case 2:
                        manageCourses(sc, courseCatalog, courseOfferings);
                        break;
                    case 3:
                        manageEnrollments(sc, studentManager, studentCourseManager, courseCatalog, enrollmentManager);
                        break;
                    case 4:
                        manageGrades(sc, gradeManager, studentManager, courseCatalog);
                        break;
                    case 5:
                        displayStudentTranscript(sc, studentManager, studentCourseManager, gradeManager);
                        break;
                    case 6:
                        displayCourseRoster(sc, courseCatalog, studentCourseManager, waitlistManager);
                        break;
                    case 7:
                        manageWaitlist(sc, waitlistManager, studentManager);
                        break;
                    case 8:
                        displayActiveEnrollments(studentCourseManager);
                        break;
                    case 9:
                        displayAllGradesForStudent(sc, studentManager, gradeManager);
                        break;
                    case 10:
                        calculateCourseGPA(sc, courseCatalog, studentCourseManager, gradeManager);
                        break;
                    case 0:
                        System.out.println("Exiting system...");
                        break;
                    default:
                        System.out.println("Invalid choice. Try again.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Enter a number.");
                choice = -1;
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                choice = -1;
            }

        } while (choice != 0);

        sc.close();
    }

    // ---------------- Student Management ----------------
    private static void manageStudents(Scanner sc, StudentManager sm) {
        System.out.println("\n=== Student Management ===");
        System.out.println("1. Add Student");
        System.out.println("2. Remove Student");
        System.out.println("3. Display All Students");
        System.out.print("Choice: ");
        try {
            int c = Integer.parseInt(sc.nextLine());
            switch (c) {
                case 1:
                    System.out.print("ID: "); String id = sc.nextLine();
                    System.out.print("Name: "); String name = sc.nextLine();
                    System.out.print("Email: "); String email = sc.nextLine();
                    System.out.print("Year: "); int year = Integer.parseInt(sc.nextLine());
                    sm.addStudent(new Student(id, name, email, year));
                    System.out.println("Student added successfully.");
                    break;
                case 2:
                    System.out.print("ID to remove: "); String rid = sc.nextLine();
                    System.out.println(sm.removeStudent(rid) ? "Removed." : "Student not found.");
                    break;
                case 3:
                    sm.displayAllStudents();
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } catch (Exception e) {
            System.out.println("Error in Student Management: " + e.getMessage());
        }
    }

    // ---------------- Course Management ----------------
    private static void manageCourses(Scanner sc, CourseCatalog cc, CourseOfferings co) {
        System.out.println("\n=== Course Management ===");
        System.out.println("1. Add Course");
        System.out.println("2. Remove Course");
        System.out.println("3. Display All Courses (Forward)");
        System.out.println("4. Display Sorted Courses");
        System.out.print("Choice: ");
        try {
            int c = Integer.parseInt(sc.nextLine());
            switch (c) {
                case 1:
                    System.out.print("Code: "); String code = sc.nextLine();
                    System.out.print("Name: "); String cname = sc.nextLine();
                    System.out.print("Credits: "); int credits = Integer.parseInt(sc.nextLine());
                    System.out.print("Capacity: "); int cap = Integer.parseInt(sc.nextLine());
                    Course course = new Course(code, cname, credits, cap);
                    cc.addCourseAtEnd(course);
                    co.addCourse(course);
                    System.out.println("Course added.");
                    break;
                case 2:
                    System.out.print("Code to remove: "); String rcode = sc.nextLine();
                    System.out.println(cc.removeCourse(rcode) & co.removeCourse(rcode) ? "Removed." : "Not found.");
                    break;
                case 3:
                    cc.displayCoursesForward();
                    break;
                case 4:
                    co.displayAllCourses();
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } catch (Exception e) {
            System.out.println("Error in Course Management: " + e.getMessage());
        }
    }

    // ---------------- Enrollment Management ----------------
    private static void manageEnrollments(Scanner sc, StudentManager sm, StudentCourseManager scm, CourseCatalog cc, EnrollmentManager em) {
        System.out.println("\n=== Enrollment Management ===");
        System.out.println("1. Enroll Student in Course");
        System.out.println("2. Withdraw Student from Course");
        System.out.print("Choice: ");
        try {
            int c = Integer.parseInt(sc.nextLine());
            switch (c) {
                case 1:
                    System.out.print("Student ID: "); String sid = sc.nextLine();
                    Student s = sm.findStudentById(sid);
                    System.out.print("Course Code: "); String code = sc.nextLine();
                    Course course = cc.searchCourse(code);
                    if (s != null && course != null) {
                        scm.enrollStudentInCourse(s, course);
                        em.enrollStudent(s);
                        System.out.println("Enrollment successful.");
                    } else System.out.println("Student or course not found.");
                    break;
                case 2:
                    System.out.print("Student ID: "); String sid2 = sc.nextLine();
                    Student s2 = sm.findStudentById(sid2);
                    System.out.print("Course Code: "); String code2 = sc.nextLine();
                    Course course2 = cc.searchCourse(code2);
                    if (s2 != null && course2 != null) {
                        scm.dropCourse(s2, course2);
                        System.out.println("Dropped successfully.");
                    } else System.out.println("Student or course not found.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } catch (Exception e) {
            System.out.println("Error in Enrollment: " + e.getMessage());
        }
    }

    // ---------------- Grades Management ----------------
    private static void manageGrades(Scanner sc, GradeManager gm, StudentManager sm, CourseCatalog cc) {
        System.out.println("\n=== Grade Management ===");
        System.out.println("1. Assign Grade");
        System.out.println("2. Get Grade");
        System.out.print("Choice: ");
        try {
            int c = Integer.parseInt(sc.nextLine());
            switch (c) {
                case 1:
                    System.out.print("Student ID: "); String sid = sc.nextLine();
                    System.out.print("Course Code: "); String cid = sc.nextLine();
                    System.out.print("Grade: "); double grade = Double.parseDouble(sc.nextLine());
                    gm.assignGrade(sid, cid, grade);
                    System.out.println("Grade assigned.");
                    break;
                case 2:
                    System.out.print("Student ID: "); String sid2 = sc.nextLine();
                    System.out.print("Course Code: "); String cid2 = sc.nextLine();
                    double g = gm.getGrade(sid2, cid2);
                    System.out.println(g >= 0 ? "Grade: " + g : "No grade found.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } catch (Exception e) {
            System.out.println("Error in Grades: " + e.getMessage());
        }
    }

    // ---------------- Display Transcript ----------------
    private static void displayStudentTranscript(Scanner sc, StudentManager sm, StudentCourseManager scm, GradeManager gm) {
        System.out.print("Enter student ID: ");
        try {
            String sid = sc.nextLine();
            Student s = sm.findStudentById(sid);
            if (s == null) { System.out.println("Student not found."); return; }
            System.out.println("=== Transcript for " + s.getName() + " ===");
            List<Course> courses = scm.getStudentCourses(s);
            if (courses.isEmpty()) System.out.println("No courses enrolled.");
            else {
                for (Course c : courses) {
                    double grade = gm.getGrade(s.getStudentId(), c.getCourseCode());
                    System.out.println(c.getCourseCode() + " - " + c.getCourseName() + ": " + (grade >= 0 ? grade : "N/A"));
                }
            }
            System.out.println("GPA: " + gm.getStudentGPA(s.getStudentId()));
        } catch (Exception e) {
            System.out.println("Error displaying transcript: " + e.getMessage());
        }
    }

    // ---------------- Display Course Roster ----------------
    private static void displayCourseRoster(Scanner sc, CourseCatalog cc, StudentCourseManager scm, WaitlistManager wm) {
        System.out.print("Enter course code: ");
        try {
            String code = sc.nextLine();
            Course c = cc.searchCourse(code);
            if (c == null) { System.out.println("Course not found."); return; }
            System.out.println("=== Roster for " + c.getCourseCode() + " ===");
            List<Student> students = scm.getStudentsInCourse(c);
            if (students.isEmpty()) System.out.println("No students enrolled.");
            else students.forEach(st -> System.out.println(st.getStudentId() + " - " + st.getName()));

            System.out.println("=== Waitlist ===");
            wm.displayWaitlist();
        } catch (Exception e) {
            System.out.println("Error displaying roster: " + e.getMessage());
        }
    }

    // ---------------- Waitlist Management ----------------
    private static void manageWaitlist(Scanner sc, WaitlistManager wm, StudentManager sm) {
        System.out.println("\n=== Waitlist Management ===");
        System.out.println("1. Add Student to Waitlist");
        System.out.println("2. Process Next Student");
        System.out.print("Choice: ");
        try {
            int c = Integer.parseInt(sc.nextLine());
            switch (c) {
                case 1:
                    System.out.print("Student ID: "); String sid = sc.nextLine();
                    Student s = sm.findStudentById(sid);
                    System.out.print("Priority (lower=higher): "); int prio = Integer.parseInt(sc.nextLine());
                    if (s != null) wm.addToWaitlist(s, prio);
                    else System.out.println("Student not found.");
                    break;
                case 2:
                    WaitlistManager.WaitlistEntry next = wm.processNextStudent();
                    System.out.println(next != null ? "Processed: " + next : "Waitlist empty.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } catch (Exception e) {
            System.out.println("Error in Waitlist Management: " + e.getMessage());
        }
    }

    // ---------------- Display All Active Enrollments ----------------
    private static void displayActiveEnrollments(StudentCourseManager scm) {
        System.out.println("\n=== All Active Enrollments ===");
        scm.displayAllEnrollments();
    }

    // ---------------- Display All Grades for Student ----------------
    private static void displayAllGradesForStudent(Scanner sc, StudentManager sm, GradeManager gm) {
        System.out.print("Student ID: ");
        try {
            String sid = sc.nextLine();
            Student s = sm.findStudentById(sid);
            if (s == null) { System.out.println("Student not found."); return; }
            gm.getAllGradesForStudent(s.getStudentId());
        } catch (Exception e) {
            System.out.println("Error displaying grades: " + e.getMessage());
        }
    }

    // ---------------- Calculate Course GPA ----------------
    private static void calculateCourseGPA(Scanner sc, CourseCatalog cc, StudentCourseManager scm, GradeManager gm) {
        System.out.print("Course Code: ");
        try {
            String code = sc.nextLine();
            Course c = cc.searchCourse(code);
            if (c == null) { System.out.println("Course not found."); return; }
            List<Student> students = scm.getStudentsInCourse(c);
            double total = 0;
            int count = 0;
            for (Student s : students) {
                double g = gm.getGrade(s.getStudentId(), c.getCourseCode());
                if (g >= 0) { total += g; count++; }
            }
            System.out.println(count > 0 ? "Course GPA: " + (total / count) : "No grades available.");
        } catch (Exception e) {
            System.out.println("Error calculating course GPA: " + e.getMessage());
        }
    }
}
