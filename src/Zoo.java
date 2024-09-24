public class Zoo {

    Animal[] animals;
    String name;
    String city;
    int nbrAnimals;
    static final int NUMBER_OF_CAGES = 25;

    public Zoo(){
        this.animals = new Animal[NUMBER_OF_CAGES];
    }

    public Zoo(String name,String city){
        this.animals = new Animal[NUMBER_OF_CAGES];
        this.name=name;
        this.city=city;
    }

    public void displayZoo(){
        System.out.println("Zoo : ");
        System.out.println("Name : "+name);
        System.out.println("City : "+city);
        System.out.println("NbrCages : "+NUMBER_OF_CAGES);
        System.out.println("nbrAnimals : "+nbrAnimals);
    }

    @Override
    public String toString() {
        return "Name: " + name + ", City: " + city + ", N° Cages: " + NUMBER_OF_CAGES + ", N° Animals: " + nbrAnimals;
    }

    boolean addAnimal(Animal animal) {
        if (nbrAnimals < NUMBER_OF_CAGES && searchAnimal(animal) == -1) {
            animals[nbrAnimals] = animal;
            nbrAnimals++;
            return true;
        }
        return false;
    }

    //2ème façon
    /*boolean addAnimal(Animal animal)
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

    int searchAnimal(Animal animal){
        for(int i=0; i<nbrAnimals ; i++)
        {
            if (animals[i].name.equals(animal.name)) {
                return i;
            }
        }
        return -1;
    }

    boolean removeAnimal(Animal animal){
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

    boolean isZooFull()
    {
        return nbrAnimals >= NUMBER_OF_CAGES;
    }

    static Zoo comparer(Zoo z1,Zoo z2){
        if(z1.nbrAnimals > z2.nbrAnimals)
        {
            return z1;
        }
        return z2;
    }

    void displayAnimals(){
        System.out.println("Animals : ");
        for(int i=0; i<nbrAnimals ; i++){
            System.out.println(animals[i]);
            //animals[i].displayAnimal();
        }
    }


}
































