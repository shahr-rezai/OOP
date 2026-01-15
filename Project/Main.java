
public class Main {
    public static void main(String[] args) {
        StudentManager sm = new StudentManager();

        sm.addStudent(new Student("S101", "Ali", "ali@mail.com", 1));
        sm.addStudent(new Student("S102", "Sara", "sara@mail.com", 2));
        sm.addStudent(new Student("S103", "Hadi", "hadi@mail.com", 2));
        sm.addStudent(new Student("S104", "Tina", "tina@mail.com", 3));
        sm.addStudent(new Student("S105", "Bilal", "bilal@mail.com", 4));

        System.out.println("\nFind Student S103:");
        System.out.println(sm.findStudentById("S103"));

        System.out.println("\nStudents in Year 2:");
        for(Student s : sm.getStudentsByYear(2)) {
            System.out.println(s);
        }

        System.out.println("\nSorted Students:");
        sm.sortStudentsByName();
        sm.displayAllStudents();

        System.out.println("\nRemoving S102:");
        sm.removeStudent("S102");
        sm.displayAllStudents();
    }
}
