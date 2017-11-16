
public class Etudiant_Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Utilisation du default constructor
		Etudiant etd1 = new Etudiant();
		etd1.setNom("Ndepo");
		etd1.setAge(20);
		
		//Utilisation du constructor avec parametre
		Etudiant etd2 = new Etudiant("Yapo",36);
    	
		System.out.println("Je me nomme" + " " +etd1.getNom() + " " + ", " +
				"et j'ai " + etd1.getAge() + " " + "ans" + "\n" );
		System.out.println("Je me nomme" + " " +etd2.getNom() + " "
				+ ", et j'ai " + etd2.getAge() + " "+ "ans " + "\n");

	}

}
