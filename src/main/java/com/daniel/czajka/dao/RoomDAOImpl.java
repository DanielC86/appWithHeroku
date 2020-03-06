package com.daniel.czajka.dao;

import com.daniel.czajka.entity.Employee;
import com.daniel.czajka.entity.Room;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class RoomDAOImpl implements RoomDAO{

    private EntityManager entityManager;

    //constructor injection
    @Autowired
    public RoomDAOImpl(EntityManager theEntityManager){
        entityManager = theEntityManager;
    }

    @Override
    public List<Room> findAll() {
        //get current hibernate session
        Session currentSession = entityManager.unwrap(Session.class);

        Query<Room> theRoomQuery = currentSession.createQuery("from Room", Room.class);

        List<Room> allRooms = theRoomQuery.getResultList();

        return allRooms;
    }

    @Override
    public Room findById(int theRoomId) {
        return null;
    }

    @Override
    public void save(Room theRoom) {

    }

    @Override
    public void deleteById(Room theRoom) {

    }
}
