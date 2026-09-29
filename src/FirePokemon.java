import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon{

    private final List<String> attacks = Arrays.asList("firelash", "flamethrower", "pyroball", "inferno");

    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, "fire");
    }

    public List<String> getAttacks() {
        return attacks;
    }

    void fireLash(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with firelash");
        if (enemy.getType().equals("fire")){
            System.out.println(enemy.getName() + " loses 10 hp");
            enemy.setHp(enemy.getHp() - 10);
            System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
        } else if (enemy.getType().equals("water")){
            System.out.println(enemy.getName() + " loses 15 hp");
            enemy.setHp(enemy.getHp() - 15);
            System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
        } else if (enemy.getType().equals("grass")){
            System.out.println(enemy.getName() + " loses 80 hp");
            enemy.setHp(enemy.getHp() - 80);
            System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
        } else if (enemy.getType().equals("electric")){
            System.out.println(enemy.getName() + " loses 35 hp");
            enemy.setHp(enemy.getHp() - 35);
            System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
        }else {
            System.out.println("Attack missed");
        }
    }

    void flameThrower(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with flamethrower");
        if (enemy.getType().equals("fire")){
            System.out.println(enemy.getName() + " loses 15 hp");
            enemy.setHp(enemy.getHp() - 15);
            System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
        } else if (enemy.getType().equals("water")){
            System.out.println(enemy.getName() + " loses 20 hp");
            enemy.setHp(enemy.getHp() - 15);
            System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
        } else if (enemy.getType().equals("grass")){
            System.out.println(enemy.getName() + " loses 70 hp");
            enemy.setHp(enemy.getHp() - 70);
            System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
        } else if (enemy.getType().equals("electric")){
            System.out.println(enemy.getName() + " loses 40 hp");
            enemy.setHp(enemy.getHp() - 40);
            System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
        }else {
            System.out.println("Attack missed");
        }
    }
    void pyroBall(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with pyroBall");
        if (enemy.getType().equals("fire")){
            System.out.println(enemy.getName() + " loses 14 hp");
            enemy.setHp(enemy.getHp() - 14);
            System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
        } else if (enemy.getType().equals("water")){
            System.out.println(enemy.getName() + " loses 18 hp");
            enemy.setHp(enemy.getHp() - 18);
            System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
        } else if (enemy.getType().equals("grass")){
            System.out.println(enemy.getName() + " loses 95 hp");
            enemy.setHp(enemy.getHp() - 95);
            System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
        } else if (enemy.getType().equals("electric")){
            System.out.println(enemy.getName() + " loses 50 hp");
            enemy.setHp(enemy.getHp() - 50);
            System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
        }else {
            System.out.println("Attack missed");
        }
    }
    void inferno(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with inferno");
        if (enemy.getType().equals("fire")){
            System.out.println(enemy.getName() + " loses 13 hp");
            enemy.setHp(enemy.getHp() - 13);
            System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
        } else if (enemy.getType().equals("water")){
            System.out.println(enemy.getName() + " loses 16 hp");
            enemy.setHp(enemy.getHp() - 16);
            System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
        } else if (enemy.getType().equals("grass")){
            System.out.println(enemy.getName() + " loses 75 hp");
            enemy.setHp(enemy.getHp() - 75);
            System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
        } else if (enemy.getType().equals("electric")){
            System.out.println(enemy.getName() + " loses 45 hp");
            enemy.setHp(enemy.getHp() - 45);
            System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
        }else {
            System.out.println("Attack missed");
        }
    }

        public void heal(Pokemon pokemon){
            System.out.println(pokemon.getName() + " eats " + pokemon.getFood() + "to heal 25hp");
            pokemon.setHp(pokemon.getHp() + 25);
            System.out.println(pokemon.getName() + " has " + pokemon.getHp() + " left");
        }
}
