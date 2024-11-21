package com.movie_initialization.dao;

import com.movie_initialization.model.Show;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShowRepository extends JpaRepository<Show, Long>{
    List<Show> findByMovieId(Long movieId);
    Show findByIdAndMovieId(Long showId, Long movieId);
}
