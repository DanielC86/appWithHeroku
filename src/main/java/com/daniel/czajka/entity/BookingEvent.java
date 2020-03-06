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

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "employee_id")
    private Employee theEmployee;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "room_id")
    private Room theRoom;

    public BookingEvent(){
    }

    public BookingEvent(String bookingDate, String bookingTimeSlot){
        this.bookingDate = bookingDate;
        this.bookingTimeSlot = bookingTimeSlot;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getBookingTimeSlot() {
        return bookingTimeSlot;
    }

    public void setBookingTimeSlot(String bookingTimeSlot) {
        this.bookingTimeSlot = bookingTimeSlot;
    }

    public Employee getTheEmployee() {
        return theEmployee;
    }

    public void setTheEmployee(Employee theEmployee) {
        this.theEmployee = theEmployee;
    }

    public Room getTheRoom() {
        return theRoom;
    }

    public void setTheRoom(Room theRoom) {
        this.theRoom = theRoom;
    }

    @Override
    public String toString() {
        return "BookingEvent{" +
                "bookingId=" + bookingId +
                ", bookingDate='" + bookingDate + '\'' +
                ", bookingTimeSlot='" + bookingTimeSlot + '\'' +
                ", theEmployee=" + theEmployee +
                ", theRoom=" + theRoom +
                '}';
    }
}
