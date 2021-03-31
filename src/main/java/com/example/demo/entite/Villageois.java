package com.example.demo.entite;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE_CLASSE")
public abstract class  Villageois {
	@Id
	private Long id;
	private String nom;
	private int hp;
	
	public Villageois() {
		super();
	}

	public Villageois(Long id, String nom, int hp) {
		super();
		this.id = id;
		this.nom = nom;
		this.hp = hp;
	}

	@Override
	public String toString() {
		return "Villageois [id=" + id + ", nom=" + nom + ", hp=" + hp + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}
	
	
	
	
	
	
	
}
