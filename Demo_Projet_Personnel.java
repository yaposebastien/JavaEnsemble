package Demo;



/*
 * ICI VOUS ETRE DANS MA CLASSE PRINCIPALE QUI EST L'ENTRER DE MON PROGRAMME!
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

//import Demo.Chef_De_Projet_Conception_Infrastructures_Reseaux;
//import Demo.Chef_De_Projet_Developpement_Bad;
//import Demo.Chef_De_Projet_Infrastructures_Reseaux_Bad;
//import Demo.Chef_Projet_Architecte_Developpement_Bad;
//import Demo.Chef_Projet_Conception_Developpement_Bad;
//import Demo.Chef_Projet_Management_Informatique_Bad;
//import Demo.Directeur_Informatique_Bad;
//import Demo.Pca_Informatique_Bad;
//import Demo.Personnel_Bad;

public class Demo_Projet_Personnel {


	public static void main(String[] args) throws Exception {
		
		
		
		
		try
		{
			//Creation de ta collection ArrayList
			Collection <Personnel_Bad> TPersonnel_Bad = new ArrayList<>();
			
			//Toujours ajouter des donnees de base pour verifier si ta classe est bien implementee
			Personnel_Bad employe1 = new Chef_De_Projet_Architecte_Infrastructures_Reseaux("Charly","Isaac");
			TPersonnel_Bad.add(employe1);
			
			Personnel_Bad employe2 = new Chef_De_Projet_Architecte_Infrastructures_Reseaux("Jean","Phil");
			TPersonnel_Bad.add(employe2);
			
			
			//Appel de la procedure pour lister tous les employes
			listeDesEmployes(TPersonnel_Bad);
			
		}//Fin du Try
		
		catch(Exception e) {
			System.out.println("Erreur application : " + " " + e.getMessage());
			
		}//Fin du Catch
		
	}
	
	public static void listeDesEmployes(Collection <Personnel_Bad> TPersonnel_Bad) {
		
		System.out.println(TPersonnel_Bad);
		
	}

}
		
			

		
	



