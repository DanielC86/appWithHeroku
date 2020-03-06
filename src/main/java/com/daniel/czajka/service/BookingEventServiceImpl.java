package com.daniel.czajka.service;

import com.daniel.czajka.dao.BookingEventDAO;
import com.daniel.czajka.entity.BookingEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BookingEventServiceImpl implements BookingEventService{

    private BookingEventDAO bookingEventDAO;

    @Autowired
    public BookingEventServiceImpl(BookingEventDAO theBookingEventDAO){
        bookingEventDAO = theBookingEventDAO;
    }

    @Override
    @Transactional
    public List<BookingEvent> findAll() {

        return bookingEventDAO.findAll();
    }
}
