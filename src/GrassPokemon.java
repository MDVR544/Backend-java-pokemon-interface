import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon{

    private final List<String> attacks = Arrays.asList("leafstorm", "solarbeam", "leechseed", "leaveblade");


    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, "grass");
    }

    public List<String> getAttacks() {
        return attacks;
    }

    public void leafStorm(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with leaf storm");
        if (enemy.getType().equals("fire")){
            System.out.println(enemy.getName() + " loses 12 hp");
            enemy.setHp(enemy.getHp() - 12);
            System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
        } else if (enemy.getType().equals("water")){
            System.out.println(enemy.getName() + " loses 70 hp");
            enemy.setHp(enemy.getHp() - 70);
            System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
        } else if (enemy.getType().equals("grass")){
            System.out.println(enemy.getName() + " loses 20 hp");
            enemy.setHp(enemy.getHp() - 20);
            System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
        } else if (enemy.getType().equals("electric")){
            System.out.println(enemy.getName() + " loses 36 hp");
            enemy.setHp(enemy.getHp() - 36);
            System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
        }else {
            System.out.println("Attack missed");
        }
    }
    public void solarBeam(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with solar beam");
        if (enemy.getType().equals("fire")){
            System.out.println(enemy.getName() + " loses 15 hp");
            enemy.setHp(enemy.getHp() - 15);
            System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
        } else if (enemy.getType().equals("water")){
            System.out.println(enemy.getName() + " loses 85 hp");
            enemy.setHp(enemy.getHp() - 85);
            System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
        } else if (enemy.getType().equals("grass")){
            System.out.println(enemy.getName() + " loses 25 hp");
            enemy.setHp(enemy.getHp() - 25);
            System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
        } else if (enemy.getType().equals("electric")){
            System.out.println(enemy.getName() + " loses 45 hp");
            enemy.setHp(enemy.getHp() - 45);
            System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
        }else {
            System.out.println("Attack missed");
        }
    }

    public void leechSeed(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with leech seed");
        if (enemy.getType().equals("fire")){
            System.out.println(enemy.getName() + " loses 11 hp");
            enemy.setHp(enemy.getHp() - 11);
            System.out.println(name.getName() + " received 11 hp");
            name.setHp(name.getHp() + 11);
            System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
        } else if (enemy.getType().equals("water")){
            System.out.println(enemy.getName() + " loses 60 hp");
            enemy.setHp(enemy.getHp() - 60);
            System.out.println(name.getName() + " received 60 hp");
            name.setHp(name.getHp() + 60);
            System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
        } else if (enemy.getType().equals("grass")){
            System.out.println(enemy.getName() + " loses 12 hp");
            enemy.setHp(enemy.getHp() - 12);
            System.out.println(name.getName() + " received 12 hp");
            name.setHp(name.getHp() + 12);
            System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
        } else if (enemy.getType().equals("electric")){
            System.out.println(enemy.getName() + " loses 25 hp");
            enemy.setHp(enemy.getHp() - 25);
            System.out.println(name.getName() + " received 25 hp");
            name.setHp(name.getHp() + 25);
            System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
        }else {
            System.out.println("Attack missed");
        }
    }

    public void leaveBlade(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with leave blade");
        if (enemy.getType().equals("fire")){
            System.out.println(enemy.getName() + " loses 23 hp");
            enemy.setHp(enemy.getHp() - 23);
            System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
        } else if (enemy.getType().equals("water")){
            System.out.println(enemy.getName() + " loses 76 hp");
            enemy.setHp(enemy.getHp() - 76);
            System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
        } else if (enemy.getType().equals("grass")){
            System.out.println(enemy.getName() + " loses 16 hp");
            enemy.setHp(enemy.getHp() - 16);
            System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
        } else if (enemy.getType().equals("electric")){
            System.out.println(enemy.getName() + " loses 37 hp");
            enemy.setHp(enemy.getHp() - 37);
            System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
        }else {
            System.out.println("Attack missed");
        }
    }
    public void heal(Pokemon pokemon){
        System.out.println(pokemon.getName() + " eats " + pokemon.getFood() + "to heal 40hp");
        pokemon.setHp(pokemon.getHp() + 40);
        System.out.println(pokemon.getName() + " has " + pokemon.getHp() + " left");
    }
}
