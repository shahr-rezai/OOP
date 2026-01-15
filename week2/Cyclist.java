public class Cyclist {
    String name;
    double endurance;
    double sprintAbility;
    double preparation;

    public Cyclist(String name, double endurance, double sprintAbility, double preparation) {
        this.name = name;
        this.endurance = endurance;
        this.sprintAbility = sprintAbility;
        this.preparation = preparation;
    }

    public double race() {
        return 0.5 * preparation + 0.25 * endurance + 0.25 * sprintAbility;
    }

    @Override
    public String toString() {
        return name + " -> Endurance: " + endurance +
               ", Sprint Ability: " + sprintAbility +
               ", Preparation: " + preparation;
    }
}
