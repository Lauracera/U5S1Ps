package epicode.U5S1Ps;

import com.github.javafaker.Faker;
import epicode.U5S1Ps.dao.EdificioDAO;
import epicode.U5S1Ps.dao.PostazioneDAO;
import epicode.U5S1Ps.entities.Edificio;
import epicode.U5S1Ps.entities.Postazione;
import epicode.U5S1Ps.entities.Prenotazione;
import epicode.U5S1Ps.entities.Utente;
import epicode.U5S1Ps.service.EdificioService;
import epicode.U5S1Ps.service.PostazioneService;
import epicode.U5S1Ps.service.PrenotazioneService;
import epicode.U5S1Ps.service.UtenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class Runner {
    @Autowired
    private EdificioService edificioService;
    @Autowired
    private PostazioneService postazioneService;
    @Autowired
    private PrenotazioneService prenotazioneService;
    @Autowired
    private UtenteService utenteService;


    Faker faker = new Faker(Locale.ITALIAN);

    public Runner(String... args) throws Exception {
        AnnotationConfigApplicationContext crx = new AnnotationConfigApplicationContext(U5S1PsApplication.class);


        Edificio edificio = (Edificio) edificioService.findAll();
        Postazione postazione = (Postazione) postazioneService.findAll();
        Prenotazione prenotazione = (Prenotazione) prenotazioneService.findAll();
        Utente utente = (Utente) utenteService.findAll();
    }


}
