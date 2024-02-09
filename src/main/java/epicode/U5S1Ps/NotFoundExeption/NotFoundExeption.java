package epicode.U5S1Ps.NotFoundExeption;

import epicode.U5S1Ps.Runner;
import org.springframework.data.crossstore.ChangeSetPersister;

public class NotFoundExeption extends RuntimeException {
    public NotFoundExeption(long id) {
        super(  id + " non trovato.");
    }
}
