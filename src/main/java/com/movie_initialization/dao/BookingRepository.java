package com.movie_initialization.dao;

import com.movie_initialization.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long> {
    List<Booking> findByShowId(Long showId);
}
