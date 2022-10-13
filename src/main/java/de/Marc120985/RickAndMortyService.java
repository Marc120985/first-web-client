package de.Marc120985;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
public class RickAndMortyService {

    WebClient webClient = WebClient.create("https://rickandmortyapi.com/api/");

    public List<RickAndMortyCharacter> getAllCharacters() {
        RickAndMortyResponse rickAndMortyResponse
            = webClient.get()
            .uri("/character")
            .retrieve()
            .toEntity(RickAndMortyResponse.class)
            .block()
            .getBody();
            return rickAndMortyResponse.getResults();



    }



    public List<RickAndMortyCharacter> getByParams(String query) {
        RickAndMortyResponse rickAndMortyResponse
                = webClient.get()
                .uri("/character/" + query)
                .retrieve()
                .toEntity(RickAndMortyResponse.class)
                .block()
                .getBody();
        return rickAndMortyResponse.getResults();
    }
}
