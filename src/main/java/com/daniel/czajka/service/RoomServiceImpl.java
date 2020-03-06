package com.daniel.czajka.service;

import com.daniel.czajka.dao.RoomDAO;
import com.daniel.czajka.entity.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RoomServiceImpl implements RoomService{

    private RoomDAO roomDAO;

    @Autowired
    public RoomServiceImpl(RoomDAO theRoomDAO){
        roomDAO = theRoomDAO;


    }
    @Override
    @Transactional
    public List<Room> findAll() {
        return roomDAO.findAll();
    }

    @Override
    public Room findById(int theRoomId) {
        return null;
    }

    @Override
    public void save(Room theRoom) {

    }

    @Override
    public void deleteById(int theRoomId) {

    }
}
