package netology.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import netology.model.Person;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;


@Repository
public class HiberRepo {
    @PersistenceContext
    EntityManager entityManager;

    @Transactional
    public List<Person> getPersonsByCity(String city) {
        var result = entityManager.createNativeQuery("SELECT * FROM homework_db.PERSONS WHERE city_of_living= :city", city);
        List<Person> list = result.getResultList();
        System.out.println(list);
        return list;
    }
}
