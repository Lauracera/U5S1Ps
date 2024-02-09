package epicode.U5S1Ps.service;

import epicode.U5S1Ps.NotFoundExeption.NotFoundExeption;
import epicode.U5S1Ps.dao.EdificioDAO;
import epicode.U5S1Ps.dao.PostazioneDAO;
import epicode.U5S1Ps.entities.Edificio;
import epicode.U5S1Ps.entities.Postazione;
import epicode.U5S1Ps.entities.Utente;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class PostazioneService {
    @Autowired
    PostazioneDAO postazioneDAO;

    public Postazione findById(long id) throws NotFoundExeption {
        return postazioneDAO.findById(id).orElseThrow(() -> new NotFoundExeption(id));
    }

    public List<Postazione> findAll(){
        return postazioneDAO.findAll();
    }

    public void save(Postazione postazione){
        postazioneDAO.save(postazione);
    }

    public void findByIdAndDelete(long id){
        Postazione postazione = this.findById(id);
        postazioneDAO.delete(postazione);
    }
}
