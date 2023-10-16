package tn.esprit.gestionZoo.entities;


public class ZooManagement {
    public static void main(String[] args) {

        Animal lion = new Animal();
        lion.setName("Simba");
        lion.setAge(8);
        lion.setFamily("Cats");
        lion.setIsMammal(true);

        Zoo myZoo = new Zoo();
        myZoo.setName( "Wildlife Park");
        myZoo.setCity("Ariana");
        myZoo.setAnimals(new Animal[25]);


        Animal dog = new Animal(2,"Canine", "Snoopy", true);
        System.out.println(myZoo);
        System.out.println(myZoo.toString());

        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(dog));

        myZoo.displayAnimals();

        System.out.println(myZoo.searchAnimal(dog));
        Animal dog2 = new Animal( 2,"Canine", "Snoopy", true);
        System.out.println(myZoo.searchAnimal(dog2));

        System.out.println(myZoo.removeAnimal(dog));
        myZoo.displayAnimals();
        System.out.println(myZoo.isZooFull());

        Zoo zoo1 = new Zoo();
        zoo1.setName("Wildlife Park");
        zoo1.setCity( "tunis");
        zoo1.setAnimals(new Animal[25]);
        System.out.println(zoo1.addAnimal(lion));
        System.out.println(zoo1.addAnimal(lion));

        System.out.println(Zoo.comparerZoo(zoo1,myZoo));
        Aquatic aquatic = new Aquatic("ocean");

        Dolphin dolphin = new Dolphin("ocean",5);
        Penguin penguin = new Penguin("ocean",6);

        // Display the objects
        System.out.println(aquatic.toString());
        System.out.println(dolphin.toString());
        System.out.println(penguin.toString());
        Aquatic aquaticS = new Aquatic("arabe");
        Dolphin dolphinS = new Dolphin("Ocean", 15.0f);
        Penguin penguinS = new Penguin("Antarctic", 20.0f);

        aquaticS.swim();
        dolphinS.swim();
        penguinS.swim();

    }




}
