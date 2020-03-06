package com.daniel.czajka.dao;

import com.daniel.czajka.entity.Room;

import java.util.List;

public interface RoomDAO {

    //show list of all rooms
    public List<Room> findAll();

    public Room findById(int theRoomId);

    public void save(Room theRoom);

    public void deleteById(Room theRoom);
}
