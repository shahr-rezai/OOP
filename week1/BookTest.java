public class BookTest{
  public static void main(String[] args){

    Book first = new Book("Kite Runners", "Khalid Hussaini","ED222", 1000);
    Book second = new Book("1000 splended suns", "Khalid Hussaini", "ED221", 1200);
    if (first.price > second.price) {
            System.out.println("First book is more expensive.");
        } else if (second.price > first.price) {
            System.out.println("Second book is more expensive.");
        } else {
            System.out.println("Both books have the same price.");
        }

        first.getDetails();
        second.getDetails();

  }
}