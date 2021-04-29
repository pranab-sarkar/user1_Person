package com.personinfo.person.PersonRepository;

import com.personinfo.person.EntityPerson.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

    Person findByName(String user_name);
}
