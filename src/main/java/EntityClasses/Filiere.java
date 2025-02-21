/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EntityClasses;

/**
 *
 * @author E460
 */
public class Filiere {
    public int idFiliere = 1110 ;
		public String libelle = "jonas" ;
		public String description = "informaticien"; 


		// Constructeur sans parametre
		public Filiere () {
			
		}
		
		// Constructeur avec parametre
		public Filiere ( int idFiliere , String libelle , String description ) {
			this.idFiliere = idFiliere ;
			this.libelle = libelle ;
			this.description = description ;
	
		}
		
		// Methode getter
		public int getIdFiliere () {
			return idFiliere ;
		}
		
		public String getLibelle () {
			return libelle ;
		}
		
		public String getDescription () {
			return description ;
		}
		
			
			// Methode setter
		
		public void setIdFiliere (int idFiliere) {
			this.idFiliere = idFiliere ;
		}
		
		public void setLibelle (String libelle) {
			this.libelle = libelle ;
		}
		
		public void setDescription(String description) {
			this.description = description ;
		}
		
}

    

