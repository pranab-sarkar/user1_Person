package com.personinfo.person.EntityPerson;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name = "Person")
public class Person {

    @Id
    @GeneratedValue
    private long id;
    private String user_name;
    private String Full_name;
    private String dob;
    private String email;
}
