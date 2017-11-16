
public abstract Etudiant {
	private String nomEtd;
	private int ageEtd;
	
	/**
	 * Default constructor
	 */
	public Etudiant() {
		nomEtd = "";
		ageEtd = 0;
	}
	/**
	 * constructor avec parametre
	 * @param nom
	 * @param age
	 */
	public Etudiant(String nom, int age) {
		setNom(nom);
		setAge(age);
	}
	
	public void setNom(String nom)
	{
		this.nomEtd = nom;
	}
	
	public void setAge(int age) 
	{
		this.ageEtd = age;
	}
	
	public String getNom()
	{
		return nomEtd;
	}
	 
	public int getAge()
	{
		return ageEtd;
	}

}
