package epicode.U5S1Ps.entities;

import epicode.U5S1Ps.Enum.TipoPostazione;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name = "postazione")
public class Postazione {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Setter(AccessLevel.NONE)
    private long idPostazione;
    private String descrizione;
    private TipoPostazione tipoPostazione;
    private int maxPersone;
    private boolean libero;

    @ManyToOne
    @JoinColumn(name = "id_edificio")
    private Edificio edificio;

    @OneToMany(mappedBy = "postazione")
    private List<Prenotazione> prenotazioni;

    public Postazione(String descrizione, TipoPostazione tipoPostazione, int maxPersone, boolean libero, Edificio edificio, List<Prenotazione> prenotazioni) {
        this.descrizione = descrizione;
        this.tipoPostazione = tipoPostazione;
        this.maxPersone = maxPersone;
        this.libero = libero;
        this.edificio = edificio;
        this.prenotazioni = prenotazioni;
    }

    @Override
    public String toString() {
        return "Postazione{" +
                "idPostazione=" + idPostazione +
                ", descrizione='" + descrizione + '\'' +
                ", tipoPostazione=" + tipoPostazione +
                ", maxPersone=" + maxPersone +
                ", libero=" + libero +
                ", edificio=" + edificio +
                ", prenotazioni=" + prenotazioni +
                '}';
    }
}
