package com.saraya.projectJDBC.model;

public class Etudiant {
	private int id;
	private String nom;
	private String prenom;
	private  int age;
	private String niveau;
	
	public Etudiant() {
		
	}
	
	public Etudiant(String nom, String prenom, int age, String niveau) {
		super();
		
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.niveau = niveau;
	}

	
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

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNiveau() {
		return niveau;
	}

	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}

	@Override
	public String toString() {
		return "Etudiant [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", niveau=" + niveau
				+ "]";
	}

	

	
	

}
