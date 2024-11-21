package com.movie_initialization.dto.interfaceImpl;

import com.movie_initialization.controller.interfaces.CancelMovieTicket;
import com.movie_initialization.dao.BookingRepository;
import com.movie_initialization.dao.ShowRepository;
import com.movie_initialization.model.Booking;
import com.movie_initialization.model.Show;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CancelMovieService implements CancelMovieTicket {
    @Autowired
    private BookingRepository bookingRepository;

    @Autowired
    private ShowRepository showRepository;

    @Override
    public void cancelTicket(Long bookingId) {
        Booking booking = bookingRepository.findById(bookingId).orElseThrow(() -> new RuntimeException("Booking not found"));
        Show show = booking.getShow();
        show.setAvailableSeats(show.getAvailableSeats() + 1);
        showRepository.save(show);
        bookingRepository.delete(booking);
    }
}
