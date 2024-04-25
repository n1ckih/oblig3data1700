package com.example.oblig3data1700;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BilettController {

    @Autowired
    BilettRepository rep;

    @PostMapping("/lagre")
    public void lagre(@RequestBody KinoBiletter bilett) {
        rep.lagreBilett(bilett);
    }

    @GetMapping("/hentBillett")
    public List<KinoBiletter> hentBillett() {
        return rep.hentAlleKinoBiletter();
    }

    @DeleteMapping("/slettAlle")
    public void slettAlle() {
        rep.slettAlleKinoBiletter();
    }
}