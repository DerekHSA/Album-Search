package org.jointheleague.api.derek.CrimeSearch.repository;


import org.jointheleague.api.derek.CrimeSearch.repository.dto.LocResponse;
import org.jointheleague.api.derek.CrimeSearch.repository.dto.Result;
import org.springframework.stereotype.Repository;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Repository
public class LocRepository {

    private final WebClient webClient;

    private static final String baseUrl = "https://spotify23.p.rapidapi.com/search/";

    public LocRepository() {
        webClient = WebClient
                .builder()
                .defaultHeader("X-RapidAPI-Key", "c71032320emsh67e557f2b286035p11416fjsnf31ce36c260b")
                .defaultHeader("X-RapidAPI-Host", "spotify23.p.rapidapi.com")
                .baseUrl(baseUrl)
                .build();
    }

    /*public LocRepository(WebClient webClientMock) {
        this.webClient = webClientMock;
    } */

    public List<Result> getResults(String query) {
        return webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .queryParam("q", query)
                        .queryParam("type", "albums")
                        .build()
                ).retrieve()
                .bodyToMono(LocResponse.class)
                .block()
                .getResults();
    }

}