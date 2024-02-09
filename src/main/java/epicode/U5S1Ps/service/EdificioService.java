package epicode.U5S1Ps.service;

import epicode.U5S1Ps.NotFoundExeption.NotFoundExeption;
import epicode.U5S1Ps.dao.EdificioDAO;
import epicode.U5S1Ps.entities.Edificio;
import epicode.U5S1Ps.entities.Utente;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class EdificioService {
    @Autowired
    EdificioDAO edificioDAO;

    public Edificio findById(long id) throws NotFoundExeption {
        return edificioDAO.findById(id).orElseThrow(() -> new NotFoundExeption(id));
    }

    public void save(Edificio edificio){
        edificioDAO.save(edificio);
    }

    public void findByIdAndDelete(long id){
        Edificio edificio = this.findById(id);
        edificioDAO.delete(edificio);
    }

}
