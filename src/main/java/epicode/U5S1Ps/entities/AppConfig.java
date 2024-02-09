package epicode.U5S1Ps.entities;

import com.github.javafaker.Faker;
import org.hibernate.mapping.List;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Locale;

@Configuration
@PropertySource(("application.properties"))
public class AppConfig {

    Faker faker = new Faker(Locale.ITALIAN);

    @Bean(name = "edificio1")
    public Edificio edificio1() {
        return new Edificio("Edificio1", faker.address().fullAddress(), faker.address().country(), "");
    }
    @Bean(name = "edificio2")
    public Edificio edificio2() {
        return new Edificio("Edificio2", faker.address().fullAddress(), faker.address().country(), "");
    }

    @Bean(name = "utente1")
    public Utente utente1(){
        return new Utente(faker.name().username(), faker.name().fullName(), faker.internet().emailAddress(), "")
    }
    @Bean(name = "utente2")
    public Utente utente2(){
        return new Utente(faker.name().username(), faker.name().fullName(), faker.internet().emailAddress(), "")
    }

    @Bean(name)






}
