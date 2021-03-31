package com.example.demo.entite;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("C_Voleur")
public class Voleur extends Villageois{
	private int energie;

	public Voleur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Voleur(Long id, String nom, int hp, int energie) {
		super(id, nom, hp);
		this.energie = energie;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Voleur [energie=" + energie + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

	public int getEnergie() {
		return energie;
	}

	public void setEnergie(int energie) {
		this.energie = energie;
	}
	
	
}
