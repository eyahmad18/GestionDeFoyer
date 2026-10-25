package tn.esprim.gestiondefoyer.entities;

import jakarta.persistence.*;
import lombok.*;
import tn.esprim.gestiondefoyer.entities.Reservation;

import java.util.List;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Chambre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idChambre;

    private long numeroChambre;

    @Enumerated(EnumType.STRING)
    private ChambreType typeC;

    @ManyToOne
    @JoinColumn(name = "bloc_id")
    private Bloc bloc;

    @OneToMany (mappedBy = "chambre")
    private List<Reservation> reservations;
}