package org.proffart.events.domain;

/**
 * Created by David on 23.08.2015.
 */

import javax.lang.model.element.Name;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "clients")
public class Client {

    @Id
    @GeneratedValue
    private int clintId;
    private String name;
    private String login;
    private String phone;
    private String email;
    private String pass;
    private String passHash;

    @Column(name = "clintId")
    public int getClintId() {
        return clintId;
    }

    public void setClintId(int clintId) {
        this.clintId = clintId;
    }

    @Column(name = "passHash")
    public String getPassHash() {
        return passHash;
    }

    public void setPassHash(String passHash) {
        this.passHash = passHash;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "login")
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "pass")
    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }


}
