package com.sparta.week1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    @GetMapping("/myinfo")
    public Person getperson() {
        Person person = new Person();
        person.setName("김성욱");
        person.setAge(22);
        person.setAddress("안산시");
        return person;
    }
}
