package Set;

import java.util.Comparator;

public class ComparatorParId implements Comparator<Departement> {
    @Override
    public int compare(Departement d1, Departement d2) {
        return d1.getId() - d2.getId();
    }
}
