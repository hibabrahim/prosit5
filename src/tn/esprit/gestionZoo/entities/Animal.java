
package tn.esprit.gestionZoo.entities;

public  class Animal {
    private String name,family;
    private int age;
    private boolean isMammal;











    public Animal(int age,String family, String name, boolean isMammal) {
        setName(name);
        setAge(age);
        setFamily(family);
        setIsMammal(isMammal);

    }
    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {

            this.family = family;

    }

    public boolean getIsMammal() {
        return isMammal;
    }

    public void setIsMammal(boolean isMammal) {

            this.isMammal = isMammal;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {

            this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("L'âge de l'animal ne peut pas être négatif.");
        }}

public Animal(){

}


    @Override
    public String toString() {
        return "Animal{" +
                "family='" + getFamily() + '\'' +
                ", name='" + getName() + '\'' +
                ", age=" + getAge()+
                ", isMammal=" + getIsMammal() +

                '}';
    }
}
