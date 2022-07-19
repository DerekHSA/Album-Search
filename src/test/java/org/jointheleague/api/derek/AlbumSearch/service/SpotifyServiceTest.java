package org.jointheleague.api.derek.AlbumSearch.service;


import org.jointheleague.api.derek.AlbumSearch.config.SpotifyController;
import org.jointheleague.api.derek.AlbumSearch.repository.dto.Result;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.web.server.ResponseStatusException;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class SpotifyControllerTest {

    private SpotifyController spotifyController;

    @Mock
    private SpotifyService spotifyService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);

        spotifyController = new SpotifyController(spotifyService);
    }

    @Test
    void givenGoodQuery_whenGetResults_thenReturnListOfResults() {
        //given
        String query = "Java";
        Result result = new Result();
        result.setTitle("TITLE");
        result.setLink("LINK");
        result.setAuthors(Collections.singletonList("AUTHORS"));
        List<Result> expectedResults = Collections.singletonList(result);

        when(spotifyService.getResults(query))
                .thenReturn(expectedResults);

        //when
        List<Result> actualResults = spotifyController.getResults(query);

        //then
        assertEquals(expectedResults, actualResults);
    }

    @Test
    void givenBadQuery_whenGetResults_thenThrowsException() {
        //given
        String query = "Java";

        //when
        //then
        Throwable exceptionThrown = assertThrows(ResponseStatusException.class, () -> spotifyController.getResults(query));
        assertEquals(exceptionThrown.getMessage(), "404 NOT_FOUND \"Result(s) not found.\"");
    }

}