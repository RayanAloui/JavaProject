package tn.esprit.gestionzoo.entities;

public sealed class Animal permits Aquatic, Terrestrial{

    private String family;
    private String name;
    private int age;
    private boolean isMammal;

    public Animal(){}

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family =family;
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
        if(age > 0)
            this.age = age;
        else
            System.out.println("l'age doit etre positif !");
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }

    public void displayAnimal(){
        System.out.println("Family: " + family + ", Name: " + name + ", Age: " + age + ", Is Mammal: " + isMammal);
    }

    @Override
    public String toString() {
        return "tn.esprit.gestionzoo.entities.Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }

}
