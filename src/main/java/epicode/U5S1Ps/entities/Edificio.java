package epicode.U5S1Ps.entities;

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
@Table(name = "edificio")
public class Edificio {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Setter(AccessLevel.NONE)
    private long id;
    private String nomeEdificio;
    private String indirizzo;
    private String citta;

    @OneToMany(mappedBy = "edificio")
    private List<Postazione> postazioni;

    public Edificio(String nomeEdificio, String indirizzo, String citta, List<Postazione> postazioni) {
        this.nomeEdificio = nomeEdificio;
        this.indirizzo = indirizzo;
        this.citta = citta;
        this.postazioni = postazioni;
    }

    @Override
    public String toString() {
        return "Edificio{" +
                "idEdificio=" + id +
                ", nomeEdificio='" + nomeEdificio + '\'' +
                ", indirizzo='" + indirizzo + '\'' +
                ", citta='" + citta + '\'' +
                ", postazioni=" + postazioni +
                '}';
    }
}
