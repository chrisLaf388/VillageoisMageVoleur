package com.example.demo.entite;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("C_Mage")
public class Mage extends Villageois {
	private int pm;

	public Mage() {
		super();
	}


	public Mage(Long id, String nom, int hp, int pm) {
		super(id, nom, hp);
		this.pm = pm;
		
	}

	@Override
	public String toString() {
		return "Mage [pm=" + pm + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

	public int getPm() {
		return pm;
	}

	public void setPm(int pm) {
		this.pm = pm;
	}
	
	
	
	
	
	
	
	
	
}
