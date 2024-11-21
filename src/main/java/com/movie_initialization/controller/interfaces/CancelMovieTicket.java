package com.movie_initialization.controller.interfaces;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface CancelMovieTicket {

    // Cancel a booking
    @DeleteMapping("/cancel/{bookingId}")
    public void cancelTicket(@PathVariable Long bookingId);
}
