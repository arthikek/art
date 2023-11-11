package com.example.art.service;

import com.example.art.DAO.PersonDoa;
import com.example.art.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    private final PersonDoa personDoa;

    @Autowired
    public PersonService(@Qualifier("fakeDao") PersonDoa personDoa) {
        this.personDoa = personDoa;
    }

    public void addPerson(Person person) {

        personDoa.addPerson(person);
    }

    public List<Person> selectAll() {

        return personDoa.selectAll();
    }

    public void removePerson(Person person) {

        personDoa.removePerson(person);
    }
}
