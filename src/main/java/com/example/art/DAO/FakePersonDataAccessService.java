package com.example.art.DAO;

import com.example.art.model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository("fakeDao")
public class FakePersonDataAccessService  implements PersonDoa {

    private static final List<Person> DB = new ArrayList<>();

    @Override
    public void insertPerson(String name) {
        DB.add(new Person(name));
    }

    @Override
    public List<Person> selectAll() {
        return DB;

    }

    @Override
    public void removePerson(Person binnen) {
        List<Person> persons = selectAll();

        for (Person person : persons) {
            System.out.println(person.getName());
            System.out.println(binnen.getName());
            if (person.getName().equals(binnen.getName())) {
                System.out.println("Pieter should be deleted");
                System.out.println(person.getId());
                persons.remove(person);
                break;
            }
        }
    }
}

