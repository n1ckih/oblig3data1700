package com.example.oblig3data1700;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Bilett")
public class KinoBiletter {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String surname;
    private String nrOfTickets;
    private String phoneNr;
    private String email;

    public KinoBiletter(String name, String surname, String nrOfTickets, String phoneNr, String email) {
        this.name = name;
        this.surname = surname;
        this.nrOfTickets = nrOfTickets;
        this.phoneNr = phoneNr;
        this.email = email;
    }
    public KinoBiletter () { }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNrOfTickets() {
        return nrOfTickets;
    }

    public void setNrOfTickets(String nrOfTickets) {
        this.nrOfTickets = nrOfTickets;
    }

    public String getPhoneNr() {
        return phoneNr;
    }

    public void setPhoneNr(String phoneNr) {
        this.phoneNr = phoneNr;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
