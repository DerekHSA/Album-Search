package org.jointheleague.api.derek.AlbumSearch.repository;


import org.jointheleague.api.derek.AlbumSearch.repository.dto.Items;
import org.jointheleague.api.derek.AlbumSearch.repository.dto.Result;
import org.springframework.stereotype.Repository;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Repository
public class SpotifyRepository {

    private final WebClient webClient;

    private static final String baseUrl = "https://spotify23.p.rapidapi.com/search/";

    public SpotifyRepository() {
        webClient = WebClient
                .builder()
                .baseUrl(baseUrl)
                .defaultHeaders(headers -> headers.add("X-RapidAPI-Key", "c71032320emsh67e557f2b286035p11416fjsnf31ce36c260b"))
                .defaultHeaders(headers -> headers.add("X-RapidAPI-Host", "spotify23.p.rapidapi.com"))
                .build();

    }

    //public LocRepository(WebClient webClientMock) {
    //    this.webClient = webClientMock;
    //}

    public List<Items> getResults(String query) {
        List<Items> result =  webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .queryParam("q", query)
                        .queryParam("type", "albums")
                        .queryParam("limit", (int) 10)
                        .build()
                ).retrieve()
                .bodyToMono(Result.class)
                .block()
                .getAlbums()
                .getItems();
        System.out.println(result);
        return result;
    }
}