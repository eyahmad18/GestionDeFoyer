package tn.esprim.gestiondefoyer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprim.gestiondefoyer.entities.Bloc;
import org.springframework.stereotype.Repository;
@Repository
public interface BlocRepository extends JpaRepository<Bloc,Long> {
}
