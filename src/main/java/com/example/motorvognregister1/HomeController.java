package com.example.motorvognregister1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HomeController {
    public final List<Motorvogn> alleMotorvogn=new ArrayList<>();

    @PostMapping("/lagre")
    public void lagreAlle(Motorvogn innMotorvogn){
        alleMotorvogn.add(innMotorvogn);
    }
    @GetMapping("/hentAlle")
    public List<Motorvogn> hentAlle(){
        return alleMotorvogn;
    }
    @PostMapping("/slett")
    public void slettAlle(){
        alleMotorvogn.clear();
    }
}
