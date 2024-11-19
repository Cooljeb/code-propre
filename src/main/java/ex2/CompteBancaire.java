package ex2;

/** Représente un compte bancaire d
 * @author DIGINAMIC
 */
public class CompteBancaire {

	/** solde : solde du compte */
	private double solde;
	
	/** decouvert : un découvert est autorisé seulement pour les comptes courants */
	private double decouvert;
	
	/** tauxRemuneration : taux de rémunération dans le cas d'un livret A */
	//private double tauxRemuneration;

	/** Le type vaut soit CC=Compte courant, ou soit LA=Livret A */
	private String type;


	/** Ce constructeur est utilisé pour créer un compte de type Livret A
	 * @param type = LA
	 * @param solde représente le solde du compte
	 * @param decouvert  représente le découvert autorisé
	 */
	public CompteBancaire(String type, double solde, double decouvert) {
		this.type = type;
		this.solde = solde;
		this.decouvert = decouvert;
	}

	/**
	 * Accesseur permettant la saisie du solde
	 * @param solde
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}

	/**
	 * Accesseur permettant la saisie du découvert
	 * @param decouvert
	 */
	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

	/** Ajoute un montant au solde
	 * @param montant
	 */
	public void ajouterMontant(double montant){
		this.solde += montant;
	}

	/** Ajoute un montant au solde
	 * @param montant <br>
	 * <p>La méthode débiterMontant permet de débiter un montant sur le compte. teste le type de compte.
	 * <p>1. S’il s’agit d’un compte courant,</p>
	 * on peut débiter de l’argent même s’il ne reste pas assez d’argent sur le compte. </p>
	 * <p>Attention cependant, il n’est pas possible de dépasser le découvert autorisé.<br>
	 * 2. S’il s’agit d’un livret A on ne peut pas retirer plus
	 * qu’il ne reste sur le compte. Les découverts ne sont pas autorisés.</p>
	 */
	public void debiterMontant(double montant){

		if (type.equals("CC")){
			if (this.solde >= decouvert && this.solde - montant > decouvert){
				this.solde = solde - montant;
			}
		}
		if (type.equals("LA")){
			if (this.solde>0 && this.solde - montant > 0){
				this.solde = solde - montant;
			}
		}
	}
//	public void appliquerRemuAnnuelle(){
//		if (type.equals("LA")){
//			this.solde = solde + solde*tauxRemuneration/100;
//		}
//	}






}
