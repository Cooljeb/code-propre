package ex3;

/**
 * Classe des mère des animaux
 */
public  class Animal {
    /**
     * Nom de l'animal
     */
    private String nom;

    /**
     * type de l'animal
     */
    private String type;

    /**
     * comportement de l'animal
     */
    private String comportement;

    /**
     * Getter du nom
     * @return nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Seeter du nom (saisie)
     * @param nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Getter dy type
     * @return type
     */
    public String getType() {
        return type;
    }
    /**
     * Seeter du type (saisie)
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Getter
     * @return comportement
     */
    public String getComportement() {
        return comportement;
    }

    /**
     * Seeter du comportement (saisie)
     * @param comportement
     */
    public void setComportement(String comportement) {
        this.comportement = comportement;
    }

    /**
     * Constructeur de la classe
     * @param nom
     * @param type
     * @param comportement
     */
    public Animal(String nom, String type, String comportement) {
        this.nom = nom;
        this.type = type;
        this.comportement = comportement;
    }

    @Override public String toString() {
        return "Animal{" + "nom='" + nom + '\'' + ", type='" + type + '\'' + ", comportement='" + comportement + '\''
                + '}';
    }

}
