package com.daniel.czajka.rest;

import com.daniel.czajka.entity.Room;
import com.daniel.czajka.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RoomRestController {

    private RoomService roomService;

    @Autowired
    public RoomRestController(RoomService theRoomService){
        roomService = theRoomService;
    }

    @GetMapping("/room")
    public List<Room> findAll(){
        return roomService.findAll();
    }
}
