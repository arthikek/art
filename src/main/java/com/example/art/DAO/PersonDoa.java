package com.example.art.DAO;

import com.example.art.model.Person;

import java.util.List;

public interface PersonDoa {

    void insertPerson(String name);

    default void addPerson(Person person) {

        insertPerson(person.getName());
    }
    List<Person> selectAll();

    default void removePerson(String name) {
        List<Person> persons = selectAll();
        for (Person person : persons) {
            if (person.getName().equals(name)) {
                persons.remove(person);
                break;
            }
        }
    }


    void removePerson(Person binnen);
}
