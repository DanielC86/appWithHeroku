package com.daniel.czajka.service;

import com.daniel.czajka.entity.Room;

import java.util.List;

public interface RoomService {

    public List<Room> findAll();

    public Room findById(int theRoomId);

    public void save(Room theRoom);

    public void deleteById(int theRoomId);
}
