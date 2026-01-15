public class PokemonTest {
    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon("Pikachu", 5, "Electric");
        Pokemon bulbasaur = new Pokemon("Bulbasaur", 4, "Grass");

        System.out.println(pikachu);
        System.out.println(bulbasaur);

        pikachu.attack(bulbasaur);
        bulbasaur.attack(pikachu);

        System.out.println(pikachu);
        System.out.println(bulbasaur);

        bulbasaur.takeDamage(5);
        System.out.println(bulbasaur);
    }
}
