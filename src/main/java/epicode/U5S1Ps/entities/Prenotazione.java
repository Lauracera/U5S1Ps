package epicode.U5S1Ps.entities;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name = "prenotazione")
public class Prenotazione {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Setter(AccessLevel.NONE)
    private long idPrenotazione;
    private LocalDate dataInizio;
    private LocalDate dataFine;

    @ManyToOne
    @JoinColumn(name = "id_postazione")
    private Postazione postazione;

    @ManyToOne
    @JoinColumn(name = "id_utente")
    private Utente utente;

    public Prenotazione(LocalDate dataInizio, LocalDate dataFine, Postazione postazione, Utente utente) {
        this.dataInizio = dataInizio;
        this.dataFine = dataFine;
        this.postazione = postazione;
        this.utente = utente;
    }

    @Override
    public String toString() {
        return "Prenotazione{" +
                "idPrenotazione=" + idPrenotazione +
                ", dataInizio=" + dataInizio +
                ", dataFine=" + dataFine +
                ", postazione=" + postazione +
                ", utente=" + utente +
                '}';
    }
}
