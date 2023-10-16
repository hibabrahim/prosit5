
package tn.esprit.gestionZoo.entities;
import tn.esprit.gestionZoo.entities.Animal;

public  class Aquatic extends Animal {
    protected String habitat;
    public Aquatic(String habitat) {
        this.habitat=habitat;
    }
    public String toString() {
        return super.toString() + ", habitat: " + habitat+'}';
    }
    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }
}