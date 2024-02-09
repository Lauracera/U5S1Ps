package epicode.U5S1Ps.entities;

import epicode.U5S1Ps.Enum.TipoPostazione;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Postazione {
    private long idPostazione;
    private String descrizione;
    private TipoPostazione tipoPostazione;
    private int maxPersone;
    private boolean libero;
    private long idEdificio;
    private long idPrenotazione;

    public Postazione(String descrizione, TipoPostazione tipoPostazione, int maxPersone, boolean libero, long idEdificio, long idPrenotazione) {
        this.descrizione = descrizione;
        this.tipoPostazione = tipoPostazione;
        this.maxPersone = maxPersone;
        this.libero = libero;
        this.idEdificio = idEdificio;
        this.idPrenotazione = idPrenotazione;
    }

    @Override
    public String toString() {
        return "Postazione{" +
                "idPostazione=" + idPostazione +
                ", descrizione='" + descrizione + '\'' +
                ", tipoPostazione=" + tipoPostazione +
                ", maxPersone=" + maxPersone +
                ", libero=" + libero +
                ", idEdificio=" + idEdificio +
                ", idPrenotazione=" + idPrenotazione +
                '}';
    }
}
