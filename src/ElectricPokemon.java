import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon{

    private final List<String> attacks = Arrays.asList("thunderpunch", "electroball", "thunder", "volttackle");

    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, "electric");
    }

    public List<String> getAttacks() {
        return attacks;
    }
    void thunderPunch(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with thunder punch");
        if (enemy.getType().equals("fire")){
            System.out.println(enemy.getName() + " loses 38 hp");
            enemy.setHp(enemy.getHp() - 38);
            System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
        } else if (enemy.getType().equals("water")){
            System.out.println(enemy.getName() + " loses 90 hp");
            enemy.setHp(enemy.getHp() - 90);
            System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
        } else if (enemy.getType().equals("grass")){
            System.out.println(enemy.getName() + " loses 45 hp");
            enemy.setHp(enemy.getHp() - 45);
            System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
        } else if (enemy.getType().equals("electric")){
            System.out.println(enemy.getName() + " loses 22 hp");
            enemy.setHp(enemy.getHp() - 22);
            System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
        }else {
            System.out.println("Attack missed");
        }
    }

    void electroBall(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with thunder punch");
        if (enemy.getType().equals("fire")){
            System.out.println(enemy.getName() + " loses 25 hp");
            enemy.setHp(enemy.getHp() - 25);
            System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
        } else if (enemy.getType().equals("water")){
            System.out.println(enemy.getName() + " loses 79 hp");
            enemy.setHp(enemy.getHp() - 79);
            System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
        } else if (enemy.getType().equals("grass")){
            System.out.println(enemy.getName() + " loses 36 hp");
            enemy.setHp(enemy.getHp() - 36);
            System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
        } else if (enemy.getType().equals("electric")){
            System.out.println(enemy.getName() + " loses 13 hp");
            enemy.setHp(enemy.getHp() - 13);
            System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
        }else {
            System.out.println("Attack missed");
        }
    }

    void thunder(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with thunder");
        if (enemy.getType().equals("fire")){
            System.out.println(enemy.getName() + " loses 30 hp");
            enemy.setHp(enemy.getHp() - 30);
            System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
        } else if (enemy.getType().equals("water")){
            System.out.println(enemy.getName() + " loses 83 hp");
            enemy.setHp(enemy.getHp() - 83);
            System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
        } else if (enemy.getType().equals("grass")){
            System.out.println(enemy.getName() + " loses 28 hp");
            enemy.setHp(enemy.getHp() - 28);
            System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
        } else if (enemy.getType().equals("electric")){
            System.out.println(enemy.getName() + " loses 15 hp");
            enemy.setHp(enemy.getHp() - 15);
            System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
        }else {
            System.out.println("Attack missed");
        }
    }

    void voltTackle(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with volt tackle");
        if (enemy.getType().equals("fire")){
            System.out.println(enemy.getName() + " loses 35 hp");
            enemy.setHp(enemy.getHp() - 35);
            System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
        } else if (enemy.getType().equals("water")){
            System.out.println(enemy.getName() + " loses 90 hp");
            enemy.setHp(enemy.getHp() - 90);
            System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
        } else if (enemy.getType().equals("grass")){
            System.out.println(enemy.getName() + " loses 25 hp");
            enemy.setHp(enemy.getHp() - 25);
            System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
        } else if (enemy.getType().equals("electric")){
            System.out.println(enemy.getName() + " received 15 hp");
            enemy.setHp(enemy.getHp() + 15);
            System.out.println(enemy.getName() + " has " + enemy.getHp() + " left");
        }else {
            System.out.println("Attack missed");
        }
    }

    public void heal(Pokemon pokemon){
        System.out.println(pokemon.getName() + " eats " + pokemon.getFood() + "to heal 15hp");
        pokemon.setHp(pokemon.getHp() + 15);
        System.out.println(pokemon.getName() + " has " + pokemon.getHp() + " left");
    }
}
