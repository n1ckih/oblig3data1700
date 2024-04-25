package com.example.oblig3data1700;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BilettController {
    public final List<KinoBiletter> biletterList = new ArrayList<>();

    @PostMapping("/lagre")
    public void lagre(KinoBiletter billetter) {
        biletterList.add(billetter);
    }

    @GetMapping("/hentBillett")
    public List<KinoBiletter> hentBillett() {
        return biletterList;
    }
}
