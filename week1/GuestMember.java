public class GuestMember extends LibraryMember {

    public GuestMember(String name, String id) {
        super(name, id);
    }

    @Override
    public int getMaxBooksAllowed() {
        return 2;
    }

    @Override
    public String toString() {
        return super.toString() + "\nType: Guest | Max Books Allowed: " + getMaxBooksAllowed();
    }
}
