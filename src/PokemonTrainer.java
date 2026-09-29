import java.util.List;

public class PokemonTrainer {
    private List<Pokemon> pokemons;
    private String name;

    public PokemonTrainer(String name, List<Pokemon> pokemons){
        this.name = name;
        this.pokemons = pokemons;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public String getName() {
        return name;
    }
}
