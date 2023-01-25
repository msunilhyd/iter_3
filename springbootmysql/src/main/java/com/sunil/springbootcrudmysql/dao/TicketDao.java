package com.sunil.springbootcrudmysql.dao;

import com.sunil.springbootcrudmysql.model.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface TicketDao extends CrudRepository<Ticket, Integer> {
}
