package com.movie_initialization.dto.interfaceImpl;

import com.movie_initialization.controller.interfaces.BookingController;
import com.movie_initialization.dao.BookingRepository;
import com.movie_initialization.dao.MovieRepository;
import com.movie_initialization.dao.ShowRepository;
import com.movie_initialization.model.Booking;
import com.movie_initialization.model.Movie;
import com.movie_initialization.model.Show;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookingService implements BookingController {

    @Autowired
    private BookingRepository bookingRepository;

    @Autowired
    private ShowRepository showRepository;

    @Override
    public String bookTicket(Long showId, String userName) {
        Show show = showRepository.findById(showId).orElseThrow(() -> new RuntimeException("Show not found"));
        if (show.getAvailableSeats() > 0) {
            // Allocate seat logic
            String seatNumber = "A" + (show.getTotalSeats() - show.getAvailableSeats() + 1); 

            // Create booking
            Booking booking = new Booking();
            booking.setUserName(userName);
            booking.setSeatNumber(seatNumber);
            booking.setShow(show);

            // Save the booking
            bookingRepository.save(booking);

            // Update available seats
            show.setAvailableSeats(show.getAvailableSeats() - 1);
            showRepository.save(show);

            return "Movie Title: "+show.getMovie().getTitle()+
                    ",\nYour Seat: " + booking.getSeatNumber() +
                    ",\nShow Time: " + show.getShowTime();

        } else {
            throw new RuntimeException("No available seats for this show.");
        }
    }

}
