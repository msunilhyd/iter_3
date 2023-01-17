package com.sunil.springbootcrudmysql.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Ticket")
public class Ticket {

    @Id
    @GeneratedValue
    private int id;
    private double amount;
    private String category;
}
