package com.spring.entity;

import org.hibernate.annotations.Where;

import javax.persistence.*;

//@Entity
//@Where(clause = "DELETED = 0")
//@Table(name = "animals")
public class Animals {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "AGE")
    private int age;

    @Column(name = "DELETED")
    private int deleted;

    public Animals() {
    }

    public Animals(String name, int age) {
        this.name = name;
        this.age = age;
        this.deleted = 0;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDeleted() {
        return deleted;
    }

    public void setDeleted(int deleted) {
        this.deleted = deleted;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", deleted=" + deleted +
                '}';
    }
}
