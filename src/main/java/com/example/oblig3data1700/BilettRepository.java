package com.example.oblig3data1700;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BilettRepository {
    @Autowired
    public JdbcTemplate db;

    public void lagreBilett(KinoBiletter bilett) {
        String sql = "INSERT INTO Bilett (name, surname, nrOfTickets, phoneNr, email) VALUES (?, ?, ?, ?, ?)";
        db.update(sql, bilett.getName(), bilett.getSurname(), bilett.getNrOfTickets(), bilett.getPhoneNr(), bilett.getEmail());
    }

    public List<KinoBiletter> hentAlleKinoBiletter() {
        String sql = "SELECT * FROM Bilett";
        return db.query(sql, new BeanPropertyRowMapper<>(KinoBiletter.class));
    }

    public List<Film> hentAlleFilmer() {
        String sql = "SELECT * FROM Film";
        return db.query(sql, new BeanPropertyRowMapper<>(Film.class));
    }

    public void slettAlleKinoBiletter() {
        String sql = "DELETE FROM Bilett";
        db.update(sql);
    }
}