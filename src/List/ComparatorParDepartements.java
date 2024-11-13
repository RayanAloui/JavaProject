package List;

import java.util.Comparator;

public class ComparatorParDepartements implements Comparator<Employe> {

    public int compare(Employe e1, Employe e2){
        return e1.getDepartement().compareTo(e2.getDepartement());
    }
}
