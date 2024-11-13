package List;

public class Employe implements Comparable<Employe> {

    private int id,grade;
    private String nom,prenom,departement;

    public Employe(){}

    public Employe(int id, int grade, String nom, String prenom, String departement) {
        this.id=id;
        this.grade=grade;
        this.nom=nom;
        this.prenom=prenom;
        this.departement=departement;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id=id;
    }

    public int getGrade(){
        return grade;
    }

    public void setGrade(int grade){
        this.grade=grade;
    }

    public String getNom(){
        return nom;
    }

    public void setNom(String nom){
        this.nom=nom;
    }

    public String getPrenom(){
        return prenom;
    }

    public void setPrenom(String prenom){
        this.prenom=prenom;
    }

    public String getDepartement(){
        return departement;
    }

    public void setDepartement(String departement){
        this.departement=departement;
    }

    @Override
    public boolean equals(Object obj){
        if(obj==null) return false;
        if(obj==this) return true;
        if(obj instanceof Employe e)
            return e.id == id && e.nom.equals(nom);
        return false;
    }

    @Override
    public String toString(){
        return "list.List.Employe{" +
                "id=" + id +
                ", grade=" + grade +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", departement='" + departement + '\'' +
                '}';
    }

    @Override
    public int compareTo(Employe e){
        return id - e.id;
    }
}
