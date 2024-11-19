package ex1;

import java.util.Date;

/**
 * Classe décrivant l'objet entreprise
 */
public class Entreprise {

	/**
	 * Variable correspondant au code Siret
	 */
	private int Siret;
	/**
	 *  Variable correspondant au nom
	 */
	private String Nom;

	/**
	 *  Variable correspondant à l'adresse
	 */
	private String adresse;

	/**
	 *  Variable correspondant à la date de création
	 */
	private Date dateCreation;
	/**
	 *  Constante correspondant au capital maximum
	 */
	public static final int CAPITAL_MAX = 3000000;

	/**
	 * Affiche le Siret
	 * @return Siret
	 */
	public int getSiret() {
		return Siret;
	}

	/**
	 * Permet de saisir un siret
	 * @param siret qui est la valeur saisie
	 */
	public void setSiret(int siret) {
		Siret = siret;
	}

	/**
	 * permet d'afficher le nom
	 * @return Nom
	 */
	public String getNom() {
		return Nom;
	}

	/**
	 *Permet de saisir un nom
	 * @param nom qui est la valeur saisie
	 */
	public void setNom(String nom) {
		Nom = nom;
	}

	/**
	 * Permet d'afficher l'adresse
	 * @return adresse
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * Permet de saisir l'adresse
	 * @param adresse
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/**
	 * Getter
	 *
	 * @return dateCreation
	 */
	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	/**
	 * Méthode permettant l'affichage du statut
	 */

	public void AfficherStatut(){
		System.out.println("Statut de l'entreprise est :" +getSiret());
	}
	
}
