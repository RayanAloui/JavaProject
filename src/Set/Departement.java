package Set;

public class Departement implements Comparable<Departement> {

    private int id , nbrEmployee;
    private String nom;

    public Departement() {}

    public Departement(int id, int nbrEmployee, String nom) {
        this.id = id;
        this.nbrEmployee = nbrEmployee;
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNbrEmployee() {
        return nbrEmployee;
    }

    public void setNbrEmployee(int nbrEmployee) {
        this.nbrEmployee = nbrEmployee;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString(){
        return "Departement{" +
                "id=" + id +
                ", nbrEmployee=" + nbrEmployee +
                ", nom='" + nom + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj){
        if(obj==null) return false;
        if(obj==this) return true;
        if(obj instanceof Departement d){
            return d.id == id && d.nom.equals(nom);
        }
        return false;
    }

    @Override
    public int hashCode(){
        int x = 34;
        x = 19 + id * x;
        x = 19 + nom.hashCode() * x;
        return x;
    }

    @Override
    public int compareTo(Departement d){
        return id - d.id;
    }

}
