package epicode.U5S1Ps.dao;

import epicode.U5S1Ps.entities.Edificio;
import epicode.U5S1Ps.entities.Prenotazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrenotazioneDAO extends JpaRepository<Prenotazione, Long> {
}
