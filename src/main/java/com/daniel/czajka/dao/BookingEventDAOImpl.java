package com.daniel.czajka.dao;

import com.daniel.czajka.entity.BookingEvent;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class BookingEventDAOImpl implements BookingEventDAO {

    private EntityManager entityManager;


    @Autowired
    public BookingEventDAOImpl(EntityManager theEntityManager){
        entityManager = theEntityManager;
    }


    @Override
    public List<BookingEvent> findAll() {

        Session currentSession = entityManager.unwrap(Session.class);

        Query<BookingEvent> theBookingEventQuery = currentSession.createQuery("from BookingEvent ", BookingEvent.class);

        List<BookingEvent> allBookings = theBookingEventQuery.getResultList();

        return allBookings;
    }
}
