package tn.esprit.gestionZoo.entities;
import tn.esprit.gestionZoo.entities.Aquatic;
public class Penguin extends Aquatic {
    protected float swimmingDepth;

    public Penguin(String habitat ,float swimmingDepth) {
super(habitat);
        this.swimmingDepth = swimmingDepth;
    }
    public String toString() {
        return super.toString() + ", Swimming depth: " + swimmingDepth+'}';
    }
    public void swim() {
        System.out.println("This penguin is swimming.");
    }
}