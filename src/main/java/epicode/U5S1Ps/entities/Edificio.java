package epicode.U5S1Ps.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Edificio {
    private long id;
    private String nomeEdificio;
    private String indirizzo;
    private String citta;

    public Edificio(String nomeEdificio, String indirizzo, String citta) {
        this.nomeEdificio = nomeEdificio;
        this.indirizzo = indirizzo;
        this.citta = citta;
    }

    @Override
    public String toString() {
        return "Edificio{" +
                "id=" + id +
                ", nomeEdificio='" + nomeEdificio + '\'' +
                ", indirizzo='" + indirizzo + '\'' +
                ", citta='" + citta + '\'' +
                '}';
    }
}
