package org.jointheleague.api.derek.AlbumSearch.config;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.jointheleague.api.derek.AlbumSearch.repository.dto.Items;
import org.jointheleague.api.derek.AlbumSearch.repository.dto.Result;
import org.jointheleague.api.derek.AlbumSearch.service.SpotifyService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class SpotifyController {

    private final SpotifyService spotifyService;

    public SpotifyController(SpotifyService spotifyService) {
        this.spotifyService = spotifyService;
    }

    @GetMapping("/searchLocResults")
    @ApiOperation(value = "Searches for albums matching the search term",
            notes = "Response may include multiple Result values.",
            response = Result.class,
            responseContainer="List")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Result(s) found"),
            @ApiResponse(code = 404, message = "Result(s) not found")
    })
    public List<Items> getResults(@RequestParam(value="q") String query){
        List<Items> results = (List<Items>) spotifyService.getResults(query);
      /*  if(CollectionUtils.isEmpty(results)){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Result(s) not found.");
        } */
        return results;
    }

}