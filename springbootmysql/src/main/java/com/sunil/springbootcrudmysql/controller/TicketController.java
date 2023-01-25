package com.sunil.springbootcrudmysql.controller;

import com.sunil.springbootcrudmysql.dao.TicketDao;
import com.sunil.springbootcrudmysql.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ticket")
public class TicketController {

    @Autowired
    private TicketDao dao;

    @PostMapping("/bookTickets")
    public String bookTicket(@RequestBody List<Ticket> tickets) {
        dao.save(tickets)
        return "tickets booked: " + tickets.size();
    }

    @GetMapping("/getTickets")
    public List<Ticket> getTickets() {
        return (List<Ticket>)dao.findAll();
    }
}
