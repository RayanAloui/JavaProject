package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.*;

public class AffectationHashMap {

    Map<Employe,Departement> employeDep = new HashMap<>();

    void ajouterEmployeDepartement(Employe emp, Departement dep){
        employeDep.put(emp,dep);
    }

    void afficherEmployesEtDepartements(){
        for(Map.Entry<Employe,Departement> emp : employeDep.entrySet()){
            System.out.println(emp.getKey().getNom() + " " + emp.getKey().getPrenom() + " is in the " + emp.getValue().getNomDep()+ " Departement");
        }
    }

    void supprimerEmploye(Employe e){
        employeDep.remove(e);
    }

    void supprimerEmployeEtDepartement(Employe e,Departement d){
        Departement dep = employeDep.get(e);
        if(d.equals(dep)){
            supprimerEmploye(e);
        }
    }

    void afficherEmployes(){
        for(Employe e : employeDep.keySet()){
            System.out.println(e);
        }

        /*
        Set<Employe> keys = employeDep.keySet();
        Iterator<Employe> it = keys.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        */
    }

    void afficherDepartements(){
        for(Departement d : employeDep.values()){
            System.out.println(d);
        }

        /*Collection<Departement> values = employeDep.values();
        Iterator<Departement> it = values.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }*/
    }

    boolean rechercherEmploye(Employe e){
        return employeDep.containsKey(e);
    }

    boolean rechercherDepartement(Departement d){
        return employeDep.containsValue(d);
    }

    TreeMap<Employe,Departement> trierMap(){
        /*
        Comparator<Employe> c = new Comparator<Employe>(){
            @Override
            public int compare(Employe e1, Employe e2){
                return e1.getID()-e2.getID();
            }
        };
        TreeMap<Employe,Departement> tree = new TreeMap<>(c);
        tree.putAll(employeDep);
        return tree;
        */

        return new TreeMap<>(employeDep);
    }


}
