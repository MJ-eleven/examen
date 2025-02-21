/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EntityClasses;

/**
 *
 * @author E460
 */
public class Etudiant {
    public int matricule = 1110 ;
		public String prenom = "jonas" ;
		public String nom = "MONTI" ;
		public int age = 19 ;
		public int idFiliere = 002 ;


		// Constructeur sans parametre
		public Etudiant () {
			
		}
		
		// Constructeur avec parametre
		public Etudiant ( int matricule , String prenom , String nom , int age , int idFiliere) {
			this.matricule = matricule ;
			this.prenom = prenom ;
			this.nom = nom ;
			this.age = age ;
			this.idFiliere = idFiliere ;
		}
		
		// Methode getter
		public int getMatricule () {
			return matricule ;
		}
		
		public String getPrenom () {
			return prenom ;
		}
		
		public String getNom () {
			return nom ;
		}
		
		public int getAge () {
			return age ;
		}
		
		public int getIdFiliere () {
			return idFiliere ;
		}
			
			// Methode setter
		
		public void setMatricule (int matricule) {
			this.matricule = matricule ;
		}
		
		public void setPrenom (String prenom) {
			this.prenom = prenom ;
		}
		
		public void setNom(String nom) {
			this.nom = nom ;
		}
		
		public void setAge(int age) {
			this.age = age ;
		}
		
		public void setIdFiliere(int idFiliere) {
			this.idFiliere = idFiliere ;
		}
		
}

    

