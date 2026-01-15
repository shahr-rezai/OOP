public class BikeRaceTest {
    public static void main(String[] args) {
        BikeRace race = new BikeRace("City Championship", 3);

        race.registerCyclist("Alice", 80, 90, 75);
        race.registerCyclist("Bob", 60, 70, 85);
        race.registerCyclist("Charlie", 90, 80, 60);

        race.printDetails();

        race.registerCyclist("David", 70, 65, 80); // should show race full

        race.userRegistration(); // allows manual input
        race.printDetails();
    }
}
