package com.movie_initialization.dto.interfaceImpl;

import com.movie_initialization.controller.interfaces.MovieController;
import com.movie_initialization.dao.MovieRepository;
import com.movie_initialization.dao.ShowRepository;
import com.movie_initialization.model.Movie;
import com.movie_initialization.model.Show;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService implements MovieController {

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private ShowRepository showRepository;

    @Override
    public void saveMovie(Movie movie) {
        movieRepository.save(movie);
    }

    @Override
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    @Override
    public List<Show> getShowsForMovie(Long movieId) {
        return showRepository.findByMovieId(movieId);
    }

}
