import java.util.Scanner;

public class BikeRace {
    String eventName;
    Cyclist[] participants;
    int nextToRegister;

    public BikeRace(String eventName, int numberRacers) {
        this.eventName = eventName;
        this.participants = new Cyclist[numberRacers];
        this.nextToRegister = 0;
    }

    public void registerCyclist(String name, double endurance, double sprint, double preparation) {
        if (nextToRegister >= participants.length) {
            System.out.println("The race is full. Cannot register " + name);
        } else {
            participants[nextToRegister] = new Cyclist(name, endurance, sprint, preparation);
            System.out.println(name + " is now a registered participant of this race.");
            nextToRegister++;
        }
    }

    public void printDetails() {
        System.out.println("Bike Race: " + eventName);
        System.out.println("Participants:");
        for (Cyclist c : participants) {
            if (c != null) {
                System.out.println(" - " + c + " | Performance: " + c.race());
            }
        }
    }

    public void userRegistration() {
        Scanner sc = new Scanner(System.in);
        System.out.println("REGISTER CYCLIST");
        System.out.println("----------------");

        System.out.print("- What is the cyclist's name? ");
        String name = sc.nextLine();

        System.out.print("- What is " + name + "'s endurance level (1-100)? ");
        double endurance = sc.nextDouble();

        System.out.print("- What is " + name + "'s sprint ability (1-100)? ");
        double sprint = sc.nextDouble();

        System.out.print("- How was " + name + "'s preparation (1-100)? ");
        double preparation = sc.nextDouble();
        sc.nextLine();

        registerCyclist(name, endurance, sprint, preparation);
    }
}
