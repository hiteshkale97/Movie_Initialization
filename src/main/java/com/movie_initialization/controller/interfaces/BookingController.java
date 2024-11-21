package com.movie_initialization.controller.interfaces;

import org.springframework.web.bind.annotation.*;

@RestController
public interface BookingController {

    // Book a ticket
    @PostMapping("/book")
    public String bookTicket(@RequestParam Long showId, @RequestParam String userName);

}
