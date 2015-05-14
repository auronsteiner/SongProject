package com.udl.softarch.springexample.models;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

/**
 * Created by davidkaste on 23/02/15.
 */

@Entity
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @NotBlank(message = "This field cannot be blank")
    @Size(max = 256, message = "Name maximum length is {max} characters long")
    private String name;

    @NotBlank(message = "Not empty band")
    @Size(max = 256, message = "Band name, max length is {max}")
    private String band;
    @NotBlank(message = "not blank")
    @Size(max = 256)
    private String email;


    public Song() {}

    public Song(String name, String band, Date date) {
        this.name = name;
        this.band = band;

    }

    public Long getId() {
        return Id;
    }

    public String getBand() {
        return band;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}