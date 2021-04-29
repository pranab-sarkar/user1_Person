package com.personinfo.person.PersonService;

import com.personinfo.person.EntityPerson.Person;
import com.personinfo.person.PersonRepository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    public Person savePersons(Person person) {
        return personRepository.save(person);
    }

    public List<Person> savePersons(List<Person> persons) {
        return personRepository.saveAll(persons);
    }

    public List<Person> getPersons() {
        return personRepository.findAll();
    }

    public Person getPersonsById(long id) {
        return personRepository.findById(id).orElse(null);
    }

    public Person getPersonsByName(String user_name) {
        return personRepository.findByName(user_name);
    }

    public String deletePerson(long id) {
        personRepository.deleteById(id);
        return "Person removed !! " + id;
    }

    public Person updatePerson(Person person) {
        Person existingPerson = personRepository.findById(person.getId()).orElse(null);
        assert existingPerson != null;
        existingPerson.setUser_name(person.getUser_name());
        existingPerson.setFull_name(person.getFull_name());
        existingPerson.setDob(person.getDob());
        existingPerson.setEmail(person.getEmail());
        return personRepository.save(existingPerson);

    }
}