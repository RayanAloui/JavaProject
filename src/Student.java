public class Student {

    private int id;
    private String nom;
    private int age;

    public Student(int id, int age , String nom) {
        this.id = id;
        this.age = age;
        this.nom = nom;
    }

    public Student(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString(){
        return "ID: " + id + " Nom: " + nom + " Age: " + age;
    }
}
