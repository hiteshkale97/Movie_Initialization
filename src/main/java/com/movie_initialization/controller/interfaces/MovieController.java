package com.movie_initialization.controller.interfaces;

import com.movie_initialization.model.Movie;
import com.movie_initialization.model.Show;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public interface MovieController {

    //save movie
    @PostMapping("/saveMovie")
    public void saveMovie(@RequestBody Movie movie);

    //get all movie
    @GetMapping("/getAllMovies")
    public List<Movie> getAllMovies();

    //get show for particular movie
    @GetMapping("/{movieId}/shows")
    public List<Show> getShowsForMovie(@PathVariable Long movieId);
}
