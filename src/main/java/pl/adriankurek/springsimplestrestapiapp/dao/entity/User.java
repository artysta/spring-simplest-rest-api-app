package pl.adriankurek.springsimplestrestapiapp.dao.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String name;
    private String city;
    private int birthYear;

    public User() {
    }

    public User(String name, String city, int birthYear) {
        this.name = name;
        this.city = city;
        this.birthYear = birthYear;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getBirthYear() {
        return birthYear;
    }
}