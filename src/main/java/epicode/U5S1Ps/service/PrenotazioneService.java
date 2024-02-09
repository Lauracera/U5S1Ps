package epicode.U5S1Ps.service;

import epicode.U5S1Ps.NotFoundExeption.NotFoundExeption;
import epicode.U5S1Ps.dao.EdificioDAO;
import epicode.U5S1Ps.dao.PrenotazioneDAO;
import epicode.U5S1Ps.entities.Edificio;
import epicode.U5S1Ps.entities.Postazione;
import epicode.U5S1Ps.entities.Prenotazione;
import epicode.U5S1Ps.entities.Utente;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class PrenotazioneService {
    @Autowired
    PrenotazioneDAO prenotazioneDAO;

    public Prenotazione findById(long id) throws NotFoundExeption {
        return prenotazioneDAO.findById(id).orElseThrow(() -> new NotFoundExeption(id));
    }

    public List<Prenotazione> findAll(){
        return prenotazioneDAO.findAll();
    }

    public void save(Prenotazione prenotazione){
        prenotazioneDAO.save(prenotazione);
    }

    public void findByIdAndDelete(long id){
        Prenotazione prenotazione = this.findById(id);
        prenotazioneDAO.delete(prenotazione);
    }
}
