package com.mezen.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Camion implements Serializable{
	    @Id
	    @GeneratedValue (strategy=GenerationType.IDENTITY)
	    private int id;
	    private String nom;
	    private double prix;

	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getNom() {
	        return nom;
	    }

	    public void setNom(String nom) {
	        this.nom = nom;
	    }

	    public double getPrix() {
	        return prix;
	    }

	    public void setPrix(double prix) {
	        this.prix = prix;
	    }
	}


