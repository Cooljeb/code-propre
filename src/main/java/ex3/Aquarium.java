package ex3;
import java.util.ArrayList;
import java.util.List;

public class Aquarium extends Animal {

	/**
	 * Constructeur de la classe
	 *
	 * @param nom
	 * @param type
	 * @param comportement
	 */

	private ArrayList<Animal> animaux ;
	public Aquarium(String nom, String type, String comportement) {
		super(nom, type, comportement);
	}

	public void addAnimal(Animal animal) {
		animaux.add(animal);
	}

	public void afficherListeAnimaux() {
		for (int i = 0; i < animaux.size(); i++) {
			System.out.println(animaux.toString());
		}
	}
	
	public double calculerKgsNourritureParJour(){
		return animaux.size() * 0.2;
	}
}