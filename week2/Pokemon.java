public class Pokemon {
    String name;
    int level;
    String pokemonType;
    int health;

    public Pokemon(String name, int level, String pokemonType) {
        this.name = name;
        this.level = level;
        this.pokemonType = pokemonType;
        this.health = level * 10;
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
        System.out.println(name + " takes " + damage + " damage, health is now " + health);
    }

    public void attack(Pokemon target) {
        int damage = level * 2;
        System.out.println(name + " attacks " + target.name + " for " + damage + " damage!");
        target.takeDamage(damage);
    }

    @Override
    public String toString() {
        return name + " | Level: " + level + " | Type: " + pokemonType + " | Health: " + health;
    }
}
