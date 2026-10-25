package tn.esprim.gestiondefoyer.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Reservation implements Serializable {

    @Id
    private String idReservation;

    private String anneeUniversitaire;

    private boolean estValide;
    @ManyToOne
    @JoinColumn(name = "chambre_id")
    private Chambre chambre;

    @ManyToMany(mappedBy = "reservations")
    private List<Etudiant> etudiants;
}