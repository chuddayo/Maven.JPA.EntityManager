package services;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import pokemon.PokeApp;
import pokemon.entities.Pokemon;
import pokemon.services.PokemonRepository;

import java.util.List;

@DataJpaTest
public class PokemonRepositoryTest {
    @Autowired
    PokemonRepository pokemonRepository;

    @Test
    public void findAllTest() {
        List<Pokemon> pokemonList = pokemonRepository.findAll();
        System.out.println(pokemonList.size());
    }

}
