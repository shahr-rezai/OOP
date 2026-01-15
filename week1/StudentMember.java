public class StudentMember extends LibraryMember {

    public StudentMember(String name, String id) {
        super(name, id);
    }

    @Override
    public int getMaxBooksAllowed() {
        return 5;
    }

    @Override
    public String toString() {
        return super.toString() + "\nType: Student | Max Books Allowed: " + getMaxBooksAllowed();
    }
}
