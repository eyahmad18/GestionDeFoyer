package tn.esprim.gestiondefoyer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprim.gestiondefoyer.entities.Chambre;
import org.springframework.stereotype.Repository;
@Repository
public interface ChambreRepository extends JpaRepository<Chambre,Long> {
}
