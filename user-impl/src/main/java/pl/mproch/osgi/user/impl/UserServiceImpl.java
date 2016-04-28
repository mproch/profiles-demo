package pl.mproch.osgi.user.impl;

import pl.mproch.osgi.user.User;
import pl.mproch.osgi.user.UserService;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Transactional
public class UserServiceImpl implements UserService {

    @PersistenceContext(unitName = "user")
    EntityManager em;

    public User loadById(Long id) {
        return em.find(User.class, id);
    }
}
