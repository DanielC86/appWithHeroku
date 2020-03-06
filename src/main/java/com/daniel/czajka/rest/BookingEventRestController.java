package com.daniel.czajka.rest;

import com.daniel.czajka.entity.BookingEvent;
import com.daniel.czajka.service.BookingEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BookingEventRestController {

    private BookingEventService bookingEventService;

    @Autowired
    public BookingEventRestController(BookingEventService theBookingEventService){
        bookingEventService = theBookingEventService;
    }

    //return list of all booking events
    @GetMapping("/allbookings")
    public List<BookingEvent> findAll(){
        return bookingEventService.findAll();
    }
}
