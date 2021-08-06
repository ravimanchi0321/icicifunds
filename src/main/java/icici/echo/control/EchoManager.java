package icici.echo.control;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import icici.echo.entity.Echo;

public class EchoManager {
    @PersistenceContext
    EntityManager em;

    public Echo find(String message) {
        return em.find(Echo.class, message);
    }

    public void insert(Echo echo) {
        em.persist(echo);
    }
}
