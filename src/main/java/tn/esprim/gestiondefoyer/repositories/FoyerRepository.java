package tn.esprim.gestiondefoyer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprim.gestiondefoyer.entities.Foyer;
import org.springframework.stereotype.Repository;
@Repository
public interface FoyerRepository extends JpaRepository<Foyer,Long> {
}
