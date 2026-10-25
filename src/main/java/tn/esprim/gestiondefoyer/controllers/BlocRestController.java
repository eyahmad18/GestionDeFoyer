package tn.esprim.gestiondefoyer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import tn.esprim.gestiondefoyer.services.IBlocService;

@RestController
public class BlocRestController {
    @Autowired
    private IBlocService blocService;
}
