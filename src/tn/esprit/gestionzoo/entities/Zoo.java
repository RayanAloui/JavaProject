package tn.esprit.gestionzoo.entities;

public class Zoo {

    private Animal[] animals;
    private String name;
    private String city;
    private int nbrAnimals;
    public static final int NUMBER_OF_CAGES = 25;

    public Zoo(){
    }

    public Zoo(String name,String city){
        this.animals = new Animal[NUMBER_OF_CAGES];
        this.name=name;
        this.city=city;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isBlank())
            System.out.println("Le nom d'un Zoo ne doit pas etre vide !");
        else
            this.name = name;
    }

    public String getCity(){
        return city;
    }

    public void setCity(String city){
        this.city=city;
    }

    public int getNbrAnimals() {
        return nbrAnimals;
    }

    public void setNbrAnimals(int nbrAnimals) {
        this.nbrAnimals = nbrAnimals;
    }

    public void displayZoo(){
        System.out.println("tn.esprit.gestionzoo.entities.Zoo : ");
        System.out.println("Name : "+name);
        System.out.println("City : "+city);
        System.out.println("NbrCages : "+NUMBER_OF_CAGES);
        System.out.println("nbrAnimals : "+nbrAnimals);
    }

    @Override
    public String toString() {
        return "Name: " + name + ", City: " + city + ", N° Cages: " + NUMBER_OF_CAGES + ", N° Animals: " + nbrAnimals;
    }

    public boolean addAnimal(Animal animal) {
        if (!isZooFull() && searchAnimal(animal) == -1) {
            animals[nbrAnimals] = animal;
            nbrAnimals++;
            return true;
        }
        return false;
    }

    //2ème façon
    /*public boolean addAnimal(Animal animal)
    {
        if(isZooFull())
        {
            System.out.println("Le Zoo est plein !");
            return false;
        }
        for(int i=0; i<nbrAnimals; i++){
            if(animals[i].name.equals(animal.name)){
                System.out.println("Cet animal existe déjà !");
                return false;
            }
        }
        animals[nbrAnimals] = animal;
        nbrAnimals++;
        return true;
    }*/

    public int searchAnimal(Animal animal){
        for(int i=0; i<nbrAnimals ; i++)
        {
            if (animals[i].getName().equals(animal.getName())) {
                return i;
            }
        }
        return -1;
    }

    public boolean removeAnimal(Animal animal){
        int index = searchAnimal(animal);
        if(index != -1 ){
            for(int i=index; i<nbrAnimals -1 ; i++){
                animals[i]=animals[i+1];
            }
            animals[nbrAnimals - 1]=null;
            nbrAnimals--;
            return true;
        }
        return false;
    }

    public boolean isZooFull()
    {
        return nbrAnimals >= NUMBER_OF_CAGES;
    }

    public static Zoo comparer(Zoo z1,Zoo z2){
        if(z1.nbrAnimals > z2.nbrAnimals)
        {
            return z1;
        }
        return z2;
    }

    public void displayAnimals(){
        System.out.println("Animals : ");
        for(int i=0; i<nbrAnimals ; i++){
            System.out.println(animals[i]);
            //animals[i].displayAnimal();
        }
    }


}
































