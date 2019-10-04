/**
 * 
 */
package tp1;



/**
 * Cette classe modélise une date de manière simplifiée.
 * @author Virginie Van den Schrieck
 *
 */
public class Date {
	
	//variables d'instance
	int jour;
	int mois;
	int annee;
	
	//Constructeur
	/**
	 * 
	 * @param jour
	 * @param mois
	 * @param année
	 */
	private Date(int jour, int mois, int année) {
		this.jour = jour;
		this.mois = mois;
		this.annee = année;
	}
	
	/**
	 * sans paramètre
	 */
	private Date() {
		this.jour = 19;
		this.mois = 04;
		this.annee = 1997;
	}
	
	// Getter an Setter
	
	/**
	 * @return the jour
	 */
	private int getJour() {
		return jour;
	}

	/**
	 * @param jour the jour to set
	 */
	private void setJour(int jour) {
		this.jour = jour;
	}

	/**
	 * @return the mois
	 */
	private int getMois() {
		return mois;
	}

	/**
	 * @param mois the mois to set
	 */
	private void setMois(int mois) {
		this.mois = mois;
	}

	/**
	 * @return the annee
	 */
	private int getAnnee() {
		return annee;
	}

	/**
	 * @param annee the annee to set
	 */
	private void setAnnee(int annee) {
		this.annee = annee;
	}
	
	// TO string
	/**
	 * Methode To string
	 */
	public String toString() {
		return "Date [jour=" + jour + ", mois=" + mois + ", annee=" + annee + "]";
	}

	/**
	 * La méthode main permet de tester la classe date en créant un objet 
	 * au départ des arguments de la ligne de commande.  Trois arguments sont attendus, sous forme d'entiers : 
	 * Le jour, le mois et l'année.  
	 * @param args les arguments de la ligne de commande
	 */
	public static void main(String [] args) {
		Date d = new Date();
		
		//d.jour = Integer.parseInt(args[0]);
		//d.mois = Integer.parseInt(args[1]);
		//d.annee = Integer.parseInt(args[2]);
		
		System.out.println(d);
	}

	/**
	 * @param jour
	 * @param mois
	 * @param année
	 */
	
}
