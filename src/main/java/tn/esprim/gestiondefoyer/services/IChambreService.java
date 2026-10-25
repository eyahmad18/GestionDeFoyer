package tn.esprim.gestiondefoyer.services;

import tn.esprim.gestiondefoyer.entities.Chambre;

import java.util.List;

public interface IChambreService {
    public List <Chambre> retrieveAllChambres();
    public Chambre retrieveChambre(Long chambreID);
    public Chambre addChambre(Chambre c);
    public void removeChambre (Long chambreID);
    public  Chambre modifyChambre (Chambre chambre);

}
