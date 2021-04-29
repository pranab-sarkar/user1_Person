package com.personinfo.person.PersonController;

import com.personinfo.person.EntityPerson.Person;
import com.personinfo.person.PersonService.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@EnableAutoConfiguration
public class PersonController {

    @Autowired
    private PersonService service;

    @PostMapping("/addUser")
    public Person addUser(@RequestBody Person person) {
        return service.savePersons(person);
    }

    @PostMapping("/addUsers")
    public List<Person> addPersons(@RequestBody List<Person> persons) {
        return service.savePersons(persons);
    }

    @GetMapping("/users")
    public List<Person> findAllPersons() {
        return service.getPersons();
    }

    @GetMapping("/productById/{user_id}")
    public Person findPersonById(@PathVariable long id) {
        return service.getPersonsById(id);
    }

    @GetMapping("/product/{user_name}")
    public Person findPersonByName(@PathVariable String user_name) {
        return service.getPersonsByName(user_name);
    }

    @PutMapping("/update")
    public Person updatePerson(@RequestBody Person person) {
        return service.updatePerson(person);
    }

    @DeleteMapping("/delete/{user_id}")
    public String deletePerson(@PathVariable long id) {
        return service.deletePerson(id);
    }
}
