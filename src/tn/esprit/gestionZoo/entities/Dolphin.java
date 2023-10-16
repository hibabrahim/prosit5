package tn.esprit.gestionZoo.entities;
import tn.esprit.gestionZoo.entities.Aquatic;
public class Dolphin extends Aquatic {
    protected float swimmingSpeed;

    public Dolphin(String habitat, float swimmingSpeed) {
super(habitat);
        this.swimmingSpeed = swimmingSpeed;
    }
    public String toString() {
        return  super.toString() + ", Swimming Speed: " + swimmingSpeed +'}';
    }
    public void swim() {
        System.out.println("This dolphin is swimming.");
    }
}