package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class Main {
    public static void main(String[] args) {

        Animal lion = new Animal("xxxx","Lion",8,true);

        Animal tigre = new Animal("xxxxx","Tigre",10,true);

        Animal renard = new Animal("xxxxxx","Renard",12,true);

        Zoo myZoo = new Zoo("Friguia","Hammamet");

        Zoo zoo = new Zoo("Belvidere","Bardo");

        lion.displayAnimal();
        tigre.displayAnimal();
        renard.displayAnimal();
        zoo.displayZoo();

        System.out.println(lion);
        System.out.println(tigre);
        System.out.println(renard);
        System.out.println(zoo);

        System.out.println(lion.toString());
        System.out.println(tigre.toString());
        System.out.println(renard.toString());
        System.out.println(zoo.toString());

        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(tigre));
        System.out.println(myZoo.addAnimal(renard));

        // Tentative de ré-ajouter le même animal
        System.out.println(myZoo.addAnimal(lion));

        myZoo.displayAnimals();

        int index1 = myZoo.searchAnimal(lion);
        System.out.println("L'animal Lion est trouvé à l'indice: " + index1);
        //System.out.println(myZoo.searchAnimal(lion));

        Animal chat = new Animal("xxxx","Chat",7,true);
        System.out.println(myZoo.searchAnimal(chat));

        System.out.println(myZoo.removeAnimal(renard));

        myZoo.displayAnimals();

        myZoo.addAnimal(chat);

        int index2 = myZoo.searchAnimal(chat);
        System.out.println("L'animal Chat est trouvé à l'indice: " + index2);
        //System.out.println(myZoo.searchAnimal(chat));

        myZoo.displayAnimals();

        //System.out.println(tn.esprit.gestionzoo.entities.Zoo.comparer(myZoo,zoo));
        Zoo zooLePlusGrand = Zoo.comparer(myZoo, zoo);
        System.out.println("Le zoo avec le plus d'animaux est: " + zooLePlusGrand.getName());

        boolean zooPlein = myZoo.isZooFull();
        System.out.println("Est ce que le zoo est plein ? " + zooPlein);

        //Partie héritage

        // Création des instances avec constructeurs par défaut
        Aquatic aquaticAnimal = new Aquatic();
        Terrestrial terrestrialAnimal = new Terrestrial();
        Dolphin dolphin = new Dolphin();
        Penguin penguin = new Penguin();

        // Affichage des objets (affichera par défaut les références car toString() n'est pas encore redéfini)
        System.out.println(aquaticAnimal);
        System.out.println(terrestrialAnimal);
        System.out.println(dolphin);
        System.out.println(penguin);

        // Création des instances avec des constructeurs paramétrés
        Aquatic aquaticAnimalP = new Aquatic("Aquatic Family", "Shark", 5, false, "Ocean");
        Terrestrial terrestrialAnimalP = new Terrestrial("Terrestrial Family", "Elephant", 10, true, 4);
        Dolphin dolphinP = new Dolphin("Dolphin Family", "Flipper", 7, true, "Sea" , 25.5f);
        Penguin penguinP = new Penguin("Penguin Family", "Pingu", 4, false, "Antarctica", 30.2f);

        // Affichage des objets (appel de toString() automatiquement)
        System.out.println(aquaticAnimalP);
        System.out.println(terrestrialAnimalP);
        System.out.println(dolphinP);
        System.out.println(penguinP);

        aquaticAnimalP.swim();  // Appel à la méthode swim() de Aquatic
        dolphinP.swim();        // Appel à la méthode swim() de Dolphin
        penguinP.swim();        // Appel à la méthode swim() hérité de Aquatic
    }
}
