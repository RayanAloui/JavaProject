public class Zoo {

    Animal[] animals;
    String name;
    String city;
    int nbrCages;

    public Zoo(){
        animals = new Animal[25];
    }

    public Zoo(String name,String city,int nbrCages){
        this.animals = new Animal[nbrCages];
        this.name=name;
        this.city=city;
        this.nbrCages=nbrCages;
    }

    public void displayZoo(){
        System.out.println("Zoo : ");
        System.out.println("Name : "+name);
        System.out.println("City : "+city);
        System.out.println("NbrCages : "+nbrCages);
    }

    @Override
    public String toString() {
        return "Name: " + name + ", City: " + city + ", N° Cages: " + nbrCages;
    }
}
