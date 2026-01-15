public class FacultyMember extends LibraryMember {

    public FacultyMember(String name, String id) {
        super(name, id);
    }

    @Override
    public int getMaxBooksAllowed() {
        return 10;
    }

    @Override
    public String toString() {
        return super.toString() + "\nType: Faculty | Max Books Allowed: " + getMaxBooksAllowed();
    }
}
