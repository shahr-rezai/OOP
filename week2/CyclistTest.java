public class CyclistTest {
    public static void main(String[] args) {
        Cyclist alice = new Cyclist("Alice", 80, 90, 75);
        Cyclist bob = new Cyclist("Bob", 60, 70, 85);
        Cyclist charlie = new Cyclist("Charlie", 90, 80, 60);

        System.out.println(alice);
        System.out.println("Alice's race performance: " + alice.race());

        System.out.println(bob);
        System.out.println("Bob's race performance: " + bob.race());

        System.out.println(charlie);
        System.out.println("Charlie's race performance: " + charlie.race());
    }
}
