package com.bookmyshow.ticketService.ticketService.controller;


import com.bookmyshow.ticketService.ticketService.model.Ticket;
import com.bookmyshow.ticketService.ticketService.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ticket")
public class TicketController {

    @Autowired
    private TicketService service;

    @PostMapping(value = "/add")
    public Ticket addTicket(@RequestBody Ticket ticket){
        return service.addTicket(ticket);
    }

    @GetMapping(value = "/get/{id}")
    public Ticket getTicket(@PathVariable long id){
        return service.get(id);
    }

}
