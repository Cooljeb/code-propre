package ex3;
import java.util.ArrayList;
import java.util.List;

public class FermeReptile {

	private List<String> types;
	private List<String> noms;
	private List<String> comportements;

	private ArrayList<Animal> animaux ;

	public void addAnimal(Animal animal) {
		animaux.add(animal);
	}
	
	public void afficherListeAnimaux(){
		for (String nom: noms){
			System.out.println(nom);
		}
	}
	
	public int compterAnimaux(){
		return noms.size();
	}
	
	public double calculerKgsNourritureParJour(){
		return noms.size() * 0.1;
	}
}