package de.Marc120985;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RickAndMortyCharacter {
    private int id;
    private String name;
    private String status;
    private String species;
}
