package com.example.task311.DAO;

import com.example.task311.Models.User;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class HibernateUserDAO implements DAO {

    // Реализация методов взаимодействия с БД

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> showAll() {
        return entityManager.createQuery("from User", User.class).getResultList();
    }

    @Override
    public User show(int id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void save(User user) {
        entityManager.persist(user);
    }

    @Override
    public void update(int id, User updatedUser) {
        entityManager.merge(updatedUser);
    }

    @Override
    public void delete(int id) {
        entityManager.remove(entityManager.find(User.class, id));
    }
}
