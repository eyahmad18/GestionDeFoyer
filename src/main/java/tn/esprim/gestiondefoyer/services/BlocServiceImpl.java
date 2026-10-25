package tn.esprim.gestiondefoyer.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprim.gestiondefoyer.repositories.BlocRepository;

@Service
public class BlocServiceImpl implements IBlocService{
    @Autowired
    private BlocRepository blocRepository;
}
