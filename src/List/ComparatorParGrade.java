package List;

import java.util.Comparator;

public class ComparatorParGrade implements Comparator<Employe> {
    @Override
    public int compare(Employe e1, Employe e2){
        return e1.getGrade() - e2.getGrade();
    }
}
