package Demo;

public class Chef_De_Projet_Architecte_Infrastructures_Reseaux extends Personnel_Bad{

	public Chef_De_Projet_Architecte_Infrastructures_Reseaux(String nom, String prenom) throws Exception {
		
		super(nom, prenom,"Chef_De_Projet_Architecte_Infrastructures_Reseaux");
		
		// TODO Auto-generated constructor stub
		
	}


	@Override
	public void description() {
		// TODO Auto-generated method stub
		super.description();
	System.out.println("MON ROLE EST DE GARANTIE LA COHERENCE TECHNIQUE ET LA PERENNITE DU SYSTEME D'INFORMATION LORS DE SES EVOLUTIONS TOUT EN VEUILLANT A OPTIMISER LES RESSOURSES, LES PERFORMANCES ET LES COUTS");
	}


	@Override
	public String presenter() {
		return null;
	}

	

}
