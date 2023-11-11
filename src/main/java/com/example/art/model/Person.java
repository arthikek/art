package com.example.art.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;

@Getter
@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private  String name;


    public Person(String name) {

        this.name = name;
    }

    public Person(@JsonProperty("id")
                  Long id, @JsonProperty("name") String name) {
        this.id = id;
        this.name = name;
    }

    public Person() {

    }


    public void setId(Long id) {
        this.id = id;
    }


}
