package com.example.pokedex.controller;

import com.example.pokedex.model.Pokemon;
import com.example.pokedex.service.PokemonService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pokemons")
@CrossOrigin
public class PokemonController {

    @Autowired
    private PokemonService service;

    // GET: Listar todos
    @GetMapping
    public ResponseEntity<Iterable<Pokemon>> listarTodos() {
        return ResponseEntity.ok(service.listarTodos());
    }

    // GET: Buscar por ID
    @GetMapping("/{id}")
    public ResponseEntity<Pokemon> buscarPorId(@PathVariable Long id) {
        Pokemon pokemon = service.buscarPorId(id);
        return ResponseEntity.ok(pokemon);
    }

    // POST: Criar novo Pokémon
    @PostMapping
    public ResponseEntity<Pokemon> criarPokemon(@Valid @RequestBody Pokemon pokemon) {
        Pokemon novo = service.criar(pokemon);
        return new ResponseEntity<>(novo, HttpStatus.CREATED);
    }

    // PUT: Atualizar Pokémon
    @PutMapping("/{id}")
    public ResponseEntity<Pokemon> atualizarPokemon(@PathVariable Long id, @Valid @RequestBody Pokemon pokemon) {
        Pokemon atualizado = service.atualizar(id, pokemon);
        return ResponseEntity.ok(atualizado);
    }

    // DELETE: Remover Pokémon
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarPokemon(@PathVariable Long id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }
}