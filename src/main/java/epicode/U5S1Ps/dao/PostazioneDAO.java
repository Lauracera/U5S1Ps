package epicode.U5S1Ps.dao;

import epicode.U5S1Ps.entities.Edificio;
import epicode.U5S1Ps.entities.Postazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostazioneDAO extends JpaRepository<Postazione, Long> {
}
