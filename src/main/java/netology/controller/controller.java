package netology.controller;

import netology.model.Person;
import netology.repository.HiberRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class controller {
    static HiberRepo repo;

    public controller(HiberRepo repo){
        this.repo = repo;
    }

    @GetMapping("persons/by-city")
    public List<Person> getPersonByCity (@RequestParam("city") String city) {
        return repo.getPersonsByCity(city);

    }
}
