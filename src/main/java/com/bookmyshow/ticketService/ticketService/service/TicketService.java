package com.bookmyshow.ticketService.ticketService.service;


import com.bookmyshow.ticketService.ticketService.dao.TicketRepository;
import com.bookmyshow.ticketService.ticketService.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketService {

    @Autowired
    private TicketRepository repository;

    public Ticket addTicket(Ticket ticket){
        return repository.save(ticket);
    }

    public Ticket get(long id) {
        return repository.getById(id);
    }
}
