package epicode.U5S1Ps.service;

import epicode.U5S1Ps.NotFoundExeption.NotFoundExeption;
import epicode.U5S1Ps.dao.EdificioDAO;
import epicode.U5S1Ps.dao.UtenteDAO;
import epicode.U5S1Ps.entities.Edificio;
import epicode.U5S1Ps.entities.Postazione;
import epicode.U5S1Ps.entities.Utente;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class UtenteService {
    @Autowired
    UtenteDAO utenteDAO;

    public Utente findById(long id) throws NotFoundExeption{
        return utenteDAO.findById(id).orElseThrow(() -> new NotFoundExeption(id));
    }

    public List<Utente> findAll(){
        return utenteDAO.findAll();
    }

    public void save(Utente utente){
        utenteDAO.save(utente);
    }

    public void findByIdAndDelete(long id){
        Utente utente = this.findById(id);
        utenteDAO.delete(utente);
    }
}
