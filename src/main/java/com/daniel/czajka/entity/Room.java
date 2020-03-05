package com.daniel.czajka.entity;

import javax.persistence.*;

@Entity
@Table(name = "room")
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int roomId;

    @Column(name = "name")
    private String roomName;

    @Column(name = "seats_number")
    private String roomSeatNumber;

    public Room(){
    }

    public Room(String roomName, String roomSeatNumber) {
        this.roomName = roomName;
        this.roomSeatNumber = roomSeatNumber;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomSeatNumber() {
        return roomSeatNumber;
    }

    public void setRoomSeatNumber(String roomSeatNumber) {
        this.roomSeatNumber = roomSeatNumber;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomId=" + roomId +
                ", roomName='" + roomName + '\'' +
                ", roomSeatNumber='" + roomSeatNumber + '\'' +
                '}';
    }
}
