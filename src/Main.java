public class Main {
    public static void main(String[] args) {

        Animal lion = new Animal();
        lion.family = "xxxx";
        lion.name = "yyyy";
        lion.age = 5;
        lion.isMammal = true;

        Animal tigre = new Animal("xxxxx","yyyyy",10,true);

        Animal renard = new Animal("xxxxxx","yyyyyy",12,true);

        Animal[] animals =new Animal[25];

        Zoo myZoo = new Zoo();
        myZoo.name = "Friguia";
        myZoo.city = "Hammamet";
        myZoo.nbrCages = 10;

        Zoo zoo = new Zoo("Belvidere","Bardo",25);

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

    }
}
