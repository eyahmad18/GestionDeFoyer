package tn.esprim.gestiondefoyer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprim.gestiondefoyer.entities.Universite;

@Repository
public interface UniversiteRepository extends JpaRepository<Universite,Long> {
}

