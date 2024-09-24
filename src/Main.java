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

        //System.out.println(Zoo.comparer(myZoo,zoo));
        Zoo zooLePlusGrand = Zoo.comparer(myZoo, zoo);
        System.out.println("Le zoo avec le plus d'animaux est: " + zooLePlusGrand.name);

        boolean zooPlein = myZoo.isZooFull();
        System.out.println("Est ce que le zoo est plein ? " + zooPlein);
    }
}
