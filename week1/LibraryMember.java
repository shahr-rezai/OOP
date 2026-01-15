public class LibraryMember {
    private String name;
    private String id;

    public LibraryMember(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    // Base method, overridden by subclasses
    public int getMaxBooksAllowed() {
        return 0;
    }

    public boolean canBorrow(int numberOfBooks) {
        return numberOfBooks <= getMaxBooksAllowed();
    }

    @Override
    public String toString() {
        return "Name: " + name + ", ID: " + id;
    }
}
