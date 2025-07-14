package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Credenziali")
public class Credenziali {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCredenziali;
    private String username;
    private String password;

    public Credenziali(){};

    public Credenziali(Long idCredenziali, String username, String password) {
        this.idCredenziali = idCredenziali;
        this.username = username;
        this.password = password;
    }

    public Long getidCredenziali() {
        return idCredenziali;
    }
    public void setidCredenziali(Long idCredenziali) {
        this.idCredenziali = idCredenziali;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }   
}