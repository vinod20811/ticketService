package com.bookmyshow.ticketService.ticketService.service;


import com.bookmyshow.ticketService.ticketService.dao.TicketRepository;
import com.bookmyshow.ticketService.ticketService.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TicketService {

    @Autowired
    private TicketRepository repository;

    public Ticket addTicket(Ticket ticket){
        return repository.save(ticket);
    }

//    public Ticket get(long id) {
//        return repository.findById(addTicket().getTicketId());
//    }

    @Transactional
    public List<Long> addMultipleTickets(int count, Ticket ticket) {
        int counter=1;
        List<Long> ticketsDB= new ArrayList<>();
        for (int i=0;i<count;i++){
            ticketsDB.add(repository.save(new Ticket(ticket.getShowId(),ticket.getTheatreId(),counter,ticket.getPrice())).getTicketId());
            counter++;
        }
        return  ticketsDB;


    }
}
