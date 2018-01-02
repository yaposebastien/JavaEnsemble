package Demo;

public abstract class Personnel_Bad implements IPersonnel {
	
	//Liste des proprietes de la classe Personnel
	private String nom;
	private String prenom;
	private String fonction;
	
	//Setters and Getters 
	
	public String getNom() {
		return nom;
	}
	/**
	 * 
	 * Le mot cle throw Exception permet de gerer les erreurs et surtout retourne une info
	 * si il y'a un conflit de validation de la propriete
	 * @param nom
	 * @throws Exception
	 */
	//
	public void setNom(String nom) throws Exception {
		if(nom != "") { this.nom = nom; }
		else { throw new Exception("Desole! Le nom de l'employe ne pas etre un champ vide."); }
		
	}
	public String getPrenom() {
		return prenom;
	}
	/**
	 * 
	 * @param prenom
	 * @throws Exception
	 */
	public void setPrenom(String prenom) throws Exception {
		if(prenom != "") { this.prenom = prenom; }
		else { throw new Exception("Desole! Le prenom de l'employe ne pas etre un champ vide."); }
	}
	public String getFonction() {
		return fonction;
	}
	/**
	 * 
	 * @param fonction
	 * @throws Exception
	 */
	public void setFonction(String fonction) throws Exception {
		if(fonction != "") { this.fonction = fonction; }
		else { throw new Exception("Desole! La fonction de l'employe ne pas etre un champ vide."); }
		
	}
	
	//Constructeur par defaut, ce constructeur n'accepte aucun parametres et intialise tous les champs a null
	
	public Personnel_Bad() throws Exception {
		nom = "";
		prenom = "";
		fonction = "";
	}
	
	//Constructeur avec parametres, nous allons utilise ce constructeur pour inserer des donnees d'exemple dans l'application
	public Personnel_Bad(String nom, String prenom, String fonction) throws Exception{
		super();
		//this.nom = nom;(Cette facon de proceder est utilise lorsque le nom de la propriete differe du nom du parametre
		setNom(nom);
		//this.prenom = prenom;
		setPrenom(prenom);
		//this.fonction = fonction;
		setFonction(fonction);
	}
	/**
	 * Tres bonne implementation de la methode presenter
	 *  mais tu peux l'ameliorer en appelant directement les champs de ta classe.
	 * et transformer cette methode en fonction qui retourne une valeur au lieu d'etre un void
	 */
	//
	@Override
	public String toString() {
		return String.format("\n Je suis %s %s %s un membre du personnel \n"  , nom, prenom, fonction);
	}
	@Override
	public void description() {
		// TODO Auto-generated method stub
		System.out.println("JE SUIS UN MENBRE DU PERSONNEL: DESCRIPTION");
	}
	
	
	

}
