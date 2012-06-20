package org.java.mpr.projekt.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity 
public class Company implements Serializable {
    
    @Id 
    @GeneratedValue
    private Long id; 
     
    private String name; 
    private String adress;
    private String telephone;
    
    protected Company() {
        
    }
    
    public Company(String name, String adress) {
        this.name = name;
        this.adress = adress;
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

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
    
    @Override
    public String toString() {
        return name + " " + adress;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
