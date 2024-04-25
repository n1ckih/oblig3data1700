package com.example.oblig3data1700;

public class KinoBiletter {
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
