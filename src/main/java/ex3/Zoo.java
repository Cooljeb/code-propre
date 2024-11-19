package ex3;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe décrivant d'un Zoo
 *
 */
public class Zoo {
    /**
     * Variabel du nom
     */
    private String nom;
//    private List<String> types;
//    private List<String> noms;
//    private List<String> comportements;

    // Nouvelle  liste dans Animaux
    private ArrayList<Animal> animaux ;

    public Zoo(String nom) {
        this.nom = nom;
        animaux = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animaux.add(animal);
    }

    public void afficherListeAnimaux() {
        for (int i = 0; i < animaux.size(); i++) {
            System.out.println(animaux.toString());
        }
    }


    /**
     * Getter for nom     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }
}