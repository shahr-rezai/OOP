import java.util.Scanner;

public class ContactTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContactBook cb = new ContactBook();
        int choice;

        do {
            System.out.println("\n<<<< Contact Book >>>>");
            System.out.println("1. Add Contact");
            System.out.println("2. View All Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume leftover newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Phone: ");
                    String phone = sc.nextLine();
                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();

                    Contact newContact = new Contact(name, phone, email);
                    cb.addContact(newContact);
                    break;

                case 2:
                    cb.viewContacts();
                    break;

                case 3:
                    System.out.print("Enter name, phone, or email to search: ");
                    String item = sc.nextLine();
                    cb.searchContact(item);
                    break;

                case 4:
                    System.out.print("Enter the name of contact to delete: ");
                    String delName = sc.nextLine();
                    cb.deleteContact(delName);
                    break;

                case 5:
                    System.out.println("Exiting... Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

        } while (choice != 5);

        sc.close();
    }
}
