package com.ra.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class User {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "fullName")
    private String fullName;
    @Column(name = "email")
    private String email;
    @Column(name = "birthday")
    private Date birthday;
    @Column(name = "sex")
    private Boolean sex;
    @Column(name = "password")
    private String password;

    public User() {
    }

    public User(Integer id, String fullName, String email, Date birthday, Boolean sex, String password) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.birthday = birthday;
        this.sex = sex;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
