import java.io.*;
import java.util.ArrayList;

public class ContactBook {
    private ArrayList<Contact> contacts;
    private static final String FILE_NAME = "contactbook.txt";

    public ContactBook() {
        contacts = new ArrayList<>();
        loadContacts(); // load from file into ArrayList
    }

    public void addContact(Contact c) {
        contacts.add(c);
        saveContact(); // save to file after adding
        System.out.println("Contact added successfully.");
    }

    public void viewContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts found.");
        } else {
            for (Contact c : contacts) {
                System.out.println("------------------");
                System.out.println(c);
            }
        }
    }

    public void searchContact(String item) {
        boolean found = false;
        for (Contact c : contacts) {
            if (c.getName().equalsIgnoreCase(item) ||
                c.getPhone().equalsIgnoreCase(item) ||
                c.getEmail().equalsIgnoreCase(item)) {
                System.out.println("------------------");
                System.out.println(c);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Contact not found.");
        }
    }

    public void deleteContact(String name) {
        boolean removed = false;
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getName().equalsIgnoreCase(name)) {
                contacts.remove(i);
                removed = true;
                break;
            }
        }
        if (removed) {
            saveContact();
            System.out.println("Contact deleted successfully.");
        } else {
            System.out.println("Contact not found.");
        }
    }

    public void saveContact() {
        try (PrintWriter pw = new PrintWriter(new FileWriter(FILE_NAME))) {
            for (Contact c : contacts) {
                pw.println(c.getName() + "," + c.getPhone() + "," + c.getEmail());
            }
        } catch (IOException e) {
            System.out.println("Error in saving contacts.");
        }
    }

    public void loadContacts() {
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            System.out.println("No existing contacts found.");
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    contacts.add(new Contact(parts[0], parts[1], parts[2]));
                }
            }
        } catch (IOException e) {
            System.out.println("Error loading contacts.");
        }
    }
}
