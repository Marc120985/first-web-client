package de.Marc120985;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RickAndMortyResponse {

    List<RickAndMortyCharacter> results;
}
