public class Encapsulation {
    public static void main(String[] args) {
        Book myBook = new Book("A Thousand Splended Suns", "Khalid Hussaini", 2016);

        System.out.println("The Book details before update: ");
        System.out.println("Title: " + myBook.getBookTitle());
        System.out.println("Author: " + myBook.getBookAuthor());
        System.out.println("Publish Year: " + myBook.getYearPublished());

        myBook.setBookTitle("Be Coming");
        myBook.setBookAuthor("Michele Obama");
        myBook.setYearPublished(2022);

        System.out.println("The Book details after update: ");
        System.out.println("Title: " + myBook.getBookTitle());
        System.out.println("Author: " + myBook.getBookAuthor());
        System.out.println("Publish Year: " + myBook.getYearPublished());
    }
}
