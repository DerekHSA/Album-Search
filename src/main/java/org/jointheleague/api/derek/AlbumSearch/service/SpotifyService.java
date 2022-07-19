package org.jointheleague.api.derek.AlbumSearch.service;

import org.jointheleague.api.derek.AlbumSearch.repository.SpotifyRepository;
import org.jointheleague.api.derek.AlbumSearch.repository.dto.Items;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SpotifyService {
private final SpotifyRepository spotifyRepository;

    public SpotifyService(SpotifyRepository spotifyRepository) {
        this.spotifyRepository = spotifyRepository;
    }

    public List<Items> getResults(String query) {
        return spotifyRepository.getResults(query);
    }
}
