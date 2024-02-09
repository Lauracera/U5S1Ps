package epicode.U5S1Ps.entities;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Prenotazione {
    private long idPrenotazione;
    private long idUtente;
    private LocalDate dataInizio;
    private LocalDate dataFine;

    public Prenotazione(long idUtente, LocalDate dataInizio, LocalDate dataFine) {
        this.idUtente = idUtente;
        this.dataInizio = dataInizio;
        this.dataFine = dataFine;
    }

    @Override
    public String toString() {
        return "Prenotazione{" +
                "idPrenotazione=" + idPrenotazione +
                ", idUtente=" + idUtente +
                ", dataInizio=" + dataInizio +
                ", dataFine=" + dataFine +
                '}';
    }
}
