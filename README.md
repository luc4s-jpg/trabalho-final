Pokedex API REST com Spring Boot

Uma API REST simples para gerenciar Pokémons, feita em Java e Spring Boot. Permite criar, listar, atualizar e deletar Pokémons.

Tecnologias utilizadas: Java 17+, Spring Boot, Spring Web, Spring Data JPA, Hibernate, Maven, H2/MySQL.

Estrutura do projeto:

trabalho-final/

src/

main/

java/

com.example.pokedex/

PokedexApplication.java

controller/PokemonController.java

service/PokemonService.java

repository/PokemonRepository.java

model/Pokemon.java

resources/

application.properties

pom.xml

Entidade Pokemon:

id: Long, autoincremento

nome: String, obrigatório

nivel: Integer, obrigatório

tipo: String, obrigatório

evolucaoCompleta: boolean, true/false

Endpoints:

GET /pokemons → lista todos

GET /pokemons/{id} → busca por ID

POST /pokemons → cria novo Pokémon

PUT /pokemons/{id} → atualiza Pokémon

DELETE /pokemons/{id} → deleta Pokémon

Exemplo de POST:

{
"nome": "Pikachu",
"nivel": 25,
"tipo": "Elétrico",
"evolucaoCompleta": false
}

Como rodar:

Clonar o repositório:
git clone https://github.com/luc4s-jpg/trabalho-final.git

cd trabalho-final

Rodar com Maven:
mvn spring-boot:run

Acessar a API:
http://localhost:8080/pokemons

Observações:

Usa H2 por padrão. Para MySQL, configure application.properties.

CORS habilitado para chamadas de qualquer frontend.
