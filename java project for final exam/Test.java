package finalExam;

import java.util.Scanner;


class Test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        do{
            System.out.println("\n--- Menu ---");
            System.out.println("1. Add Student");
            System.out.println("2. Add Course");
            System.out.println("3. Register Student");
            System.out.println("4. Drop Course");
            System.out.println("5. Search Course");
            System.out.println("6. View All Students and Courses");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            try{
                choice = Integer.parseInt(sc.nextLine());
            } catch(NumberFormatException e){
                System.out.println("Invalid input! Please enter digits only");
                continue;
            }

            switch(choice){
                case 1:
                    try{
                        System.out.print("Enter Student ID: ");
                        String sid = sc.nextLine();
                        System.out.print("Enter Student Name: ");
                        String sname = sc.nextLine();
                        System.out.print("Enter Department: ");
                        String dept = sc.nextLine();
                        Student s = new Student(sid, sname);
                        s.addDepartment(dept);
                        Student.addStudent(s);
                    } catch(DuplicatedIdException e){
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 2:
                    try{
                        System.out.print("Enter Course Code: ");
                        String ccode = sc.nextLine();
                        System.out.print("Enter Course Name: ");
                        String cname = sc.nextLine();
                        int limit = 0;
                        while(true){
                            System.out.print("Enter Seat Limit: ");
                            String input = sc.nextLine();
                            try{
                                limit = Integer.parseInt(input);
                                break;
                            } catch(NumberFormatException e){
                                System.out.println("Invalid number! Please enter digits only");
                            }
                        }
                        Course c = new Course(ccode, cname, limit);
                        Course.addCourse(c);
                    } catch(DuplicateCourseException e){
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 3:
                    try{
                        System.out.print("Enter Student ID: ");
                        String rsid = sc.nextLine();
                        System.out.print("Enter Course Code: ");
                        String rccode = sc.nextLine();
                        RegistrationManagement.registerStudent(rsid, rccode);
                    } catch(StudentNotFoundException | CourseNotFoundException | CourseFullException e){
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 4:
                    try{
                        System.out.print("Enter Student ID: ");
                        String dsid = sc.nextLine();
                        System.out.print("Enter Course Code: ");
                        String dccode = sc.nextLine();
                        RegistrationManagement.dropCourse(dsid, dccode);
                    } catch(StudentNotFoundException | CourseNotFoundException e){
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 5:
                    System.out.print("Enter Course Code to search: ");
                    String searchCode = sc.nextLine();
                    Course course = Course.findCourse(searchCode);
                    if(course != null){
                        System.out.println("Course found: " + course.getCourseName() + ", Seats: " + course.getCurrentSeats() + "/" + course.getSeatLimit());
                    } else {
                        System.out.println("Course not found");
                    }
                    break;
                case 6:
                    System.out.println("--- Students ---");
                    for(Student st: Student.studentsList){
                        st.displayStudentInfo();
                    }
                    System.out.println("--- Courses ---");
                    for(Course co: Course.coursesMap.values()){
                        System.out.println("Code: " + co.getCourseCode() + ", Name: " + co.getCourseName() + ", Seats: " + co.getCurrentSeats() + "/" + co.getSeatLimit());
                    }
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }

        } while(choice != 7);

        sc.close();
    }
}
