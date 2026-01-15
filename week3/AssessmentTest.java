import java.util.Scanner;

public class AssessmentTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add assessment");
            System.out.println("2. View assessments");
            System.out.println("3. Modify grade of assessment");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Assessment name: ");
                    String name = sc.nextLine();
                    System.out.print("Mark: ");
                    int mark = sc.nextInt();
                    System.out.print("Total possible marks: ");
                    int total = sc.nextInt();
                    student.addAssessment(name, mark, total);
                    break;

                case 2:
                    System.out.println(student);
                    break;

                case 3:
                    System.out.print("Assessment name to modify: ");
                    String modName = sc.nextLine();
                    System.out.println("Available grades: A, A_MINUS, B_PLUS, B, B_MINUS, C_PLUS, C, C_MINUS, D, F");
                    System.out.print("Enter new grade exactly as shown: ");
                    String gradeStr = sc.nextLine();

                    Grade g = null;
                    for (Grade gr : Grade.values()) {
                        if (gr.name().equals(gradeStr)) {
                            g = gr;
                            break;
                        }
                    }

                    if (g != null) {
                        student.addAssessment(modName, g);
                    } else {
                        System.out.println("Invalid grade. Please enter exactly as shown.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}