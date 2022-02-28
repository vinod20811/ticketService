package com.bookmyshow.ticketService.ticketService.model;

import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.persistence.*;

@Entity
@Table(name = "ticket")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ticketId;
    private long showId;
    private int theatreId;
    private int seatNo;
    private double price;

    public Ticket() {
    }

    public Ticket(long ticketId, long showId, int theatreId, int seatNo, double price) {
        this.ticketId = ticketId;
        this.showId = showId;
        this.theatreId = theatreId;
        this.seatNo = seatNo;
        this.price = price;
    }

    public long getTicketId() {
        return ticketId;
    }

    public void setTicketId(long ticketId) {
        this.ticketId = ticketId;
    }

    public long getShowId() {
        return showId;
    }

    public void setShowId(long showId) {
        this.showId = showId;
    }

    public int getTheatreId() {
        return theatreId;
    }

    public void setTheatreId(int theatreId) {
        this.theatreId = theatreId;
    }

    public int getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(int seatNo) {
        this.seatNo = seatNo;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
