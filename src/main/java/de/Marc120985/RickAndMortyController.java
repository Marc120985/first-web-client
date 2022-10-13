package de.Marc120985;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class RickAndMortyController {
    RickAndMortyService rickAndMortyService;

    public RickAndMortyController(RickAndMortyService rickAndMortyService) {
        this.rickAndMortyService = rickAndMortyService;
    }

//    @GetMapping
//    public List<RickAndMortyCharacter> getAllCharacters(){
//        return rickAndMortyService.getAllCharacters();

//    }
    @GetMapping
    public List<RickAndMortyCharacter> getAllCharacters(@RequestParam Map<String,String> allParams){
        String completeQuery = "?" + allParams
                .entrySet().stream().map(entry -> entry.getKey() + "=" + entry.getValue())
                .collect(Collectors.joining("&"));
        return rickAndMortyService.getByParams(completeQuery);

    }
}
