package com.bookmyshow.ticketService.ticketService.dao;

import com.bookmyshow.ticketService.ticketService.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends CrudRepository<Ticket,Long> {


}
