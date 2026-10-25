package tn.esprim.gestiondefoyer.controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprim.gestiondefoyer.entities.Chambre;
import tn.esprim.gestiondefoyer.services.IChambreService;

import java.util.List;

@RestController @AllArgsConstructor
@RequestMapping("/chambre")
public class ChambreRestController {
    @Autowired
    IChambreService chambreService;
    //http://localhost:8089/tpfoyer/chambre/retrieve-all-chambres
    @GetMapping("/retrieve-all-chambres")
    public List<Chambre> getChambres(){
        List<Chambre> listChambres =chambreService.retrieveAllChambres();
        return listChambres;}
    //http:/localhost:8089/tpfover/chambre/retrieve-chambre/8
    @GetMapping("/retrieve-chambre/{chambre-id}")
    public Chambre retrieveChambre(@PathVariable("chambre-id")Long chld){
        Chambre chambre = chambreService.retrieveChambre(chld);
        return chambre;
    }
}


