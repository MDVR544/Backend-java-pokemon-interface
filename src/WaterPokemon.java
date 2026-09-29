import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon{

    private final List<String> attacks = Arrays.asList("surf", "hydropump", "hydrocanon", "raindance");

    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, "water");
    }


    public List<String> getAttacks() {
        return attacks;
    }

    void surf(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with surf");
            if (enemy.getType().equals("fire")){
            System.out.println(enemy.getName() + " loses 80 hp");
            enemy.setHp(enemy.getHp() - 80);
            System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
        } else if (enemy.getType().equals("water")){
            System.out.println(enemy.getName() + " loses 12 hp");
            enemy.setHp(enemy.getHp() - 12);
            System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
        } else if (enemy.getType().equals("grass")){
            System.out.println(enemy.getName() + " loses 45 hp");
            enemy.setHp(enemy.getHp() - 45);
            System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
        } else if (enemy.getType().equals("electric")){
            System.out.println(enemy.getName() + " loses 25 hp");
            enemy.setHp(enemy.getHp() - 25);
            System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
        }else {
            System.out.println("Attack missed");
        }
    }
    void hydroPump(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with hydropump");
        if (enemy.getType().equals("fire")){
            System.out.println(enemy.getName() + " loses 95 hp");
            enemy.setHp(enemy.getHp() - 95);
            System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
        } else if (enemy.getType().equals("water")){
            System.out.println(enemy.getName() + " loses 20 hp");
            enemy.setHp(enemy.getHp() - 20);
            System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
        } else if (enemy.getType().equals("grass")){
            System.out.println(enemy.getName() + " loses 50 hp");
            enemy.setHp(enemy.getHp() - 50);
            System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
        } else if (enemy.getType().equals("electric")){
            System.out.println(enemy.getName() + " loses 30 hp");
            enemy.setHp(enemy.getHp() - 30);
            System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
        }else {
            System.out.println("Attack missed");
        }
    }

    void hydroCanon(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with hydrocanon");
        if (enemy.getType().equals("fire")){
            System.out.println(enemy.getName() + " loses 100 hp");
            enemy.setHp(enemy.getHp() - 100);
            System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
        } else if (enemy.getType().equals("water")){
            System.out.println(enemy.getName() + " loses 30 hp");
            enemy.setHp(enemy.getHp() - 30);
            System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
        } else if (enemy.getType().equals("grass")){
            System.out.println(enemy.getName() + " loses 65 hp");
            enemy.setHp(enemy.getHp() - 65);
            System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
        } else if (enemy.getType().equals("electric")){
            System.out.println(enemy.getName() + " loses 45 hp");
            enemy.setHp(enemy.getHp() - 45);
            System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
        }else {
            System.out.println("Attack missed");
        }
    }

    void rainDance(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with rain dance");
        if (enemy.getType().equals("fire")){
            System.out.println(enemy.getName() + " loses 75 hp");
            enemy.setHp(enemy.getHp() - 75);
            System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
        } else if (enemy.getType().equals("water")){
            System.out.println(enemy.getName() + " loses 25 hp");
            enemy.setHp(enemy.getHp() - 25);
            System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
        } else if (enemy.getType().equals("grass")){
            System.out.println(enemy.getName() + " received 32 hp");
            enemy.setHp(enemy.getHp() + 32);
            System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
        } else if (enemy.getType().equals("electric")){
            System.out.println("rain dance has no effect on " + enemy.getName());
            System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
        }else {
            System.out.println("Attack missed");
        }
    }
    public void heal(Pokemon pokemon){
        System.out.println(pokemon.getName() + " eats " + pokemon.getFood() + "to heal 35hp");
        pokemon.setHp(pokemon.getHp() + 35);
        System.out.println(pokemon.getName() + " has " + pokemon.getHp() + " left");
    }
}
