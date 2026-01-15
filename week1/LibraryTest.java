public class LibraryTest {
    public static void main(String[] args) {
        LibraryMember[] members = new LibraryMember[3];

        members[0] = new StudentMember("Alice", "S101");
        members[1] = new FacultyMember("Dr. Bob", "F202");
        members[2] = new GuestMember("Charlie", "G303");

        int[] booksRequested = {4, 8, 3};

        for (int i = 0; i < members.length; i++) {
            LibraryMember m = members[i];
            int requested = booksRequested[i];

            System.out.println(m);
            System.out.println("Wants to borrow " + requested + " book(s)");
            System.out.println("Borrowing allowed: " + (m.canBorrow(requested) ? "Yes" : "No"));
            System.out.println();
        }
    }
}
