package com.daniel.czajka.entity;

import javax.persistence.*;

@Entity
@Table(name = "booking_event")
public class BookingEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int bookingId;

    @Column(name = "date")
    private String bookingDate;

    @Column(name = "time_slot")
    private String bookingTimeSlot;

    @Column(name = "employee_id")
    private int employeeId;

    @Column(name = "room_id")
    private int roomId;

}
