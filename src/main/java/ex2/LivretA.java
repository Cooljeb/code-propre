package ex2;

/**
 * Classe présentant le livret A
 */
public class LivretA extends CompteBancaire {

	private double tauxRemuneration;

	/**
	 * Ce constructeur est utilisé pour créer un compte de type Livret A
	 *
	 * @param type      = LA
	 * @param solde     représente le solde du compte
	 * @param decouvert pas de découvert autorisé donc il est directement mis à 0
	 * @param tauxRemuneration correspond au taux de rémunération du compte
	 */
	public LivretA(String type, double solde, double decouvert, double tauxRemuneration) {
		super(type, solde, decouvert);
		this.tauxRemuneration = tauxRemuneration;
		this.setDecouvert(0);
	}
}
