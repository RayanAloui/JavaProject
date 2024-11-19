package Set;

import java.util.Scanner;
import java.util.TreeSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        DepartementHashSet departementManager = new DepartementHashSet();

        Scanner scanner = new Scanner(System.in);

        int choix;
        do {
            System.out.println("\n*** Menu ***");
            System.out.println("1. Ajouter un département");
            System.out.println("2. Rechercher un département par nom");
            System.out.println("3. Rechercher un département par objet");
            System.out.println("4. Supprimer un département");
            System.out.println("5. Afficher tous les départements");
            System.out.println("6. Trier les départements par ID");
            System.out.println("7. Quitter");
            System.out.print("Choisissez une option (1-7) : ");
            choix = scanner.nextInt();
            scanner.nextLine(); // Consommer la ligne restante

            switch (choix) {
                case 1:
                    // Ajouter un département
                    System.out.print("Entrez l'ID du département: ");
                    int id = scanner.nextInt();
                    System.out.print("Entrez le nombre d'employés: ");
                    int nbrEmployee = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Entrez le nom du département: ");
                    String nom = scanner.nextLine();
                    departementManager.ajouterDepartement(new Departement(id, nbrEmployee, nom));
                    System.out.println("Département ajouté !");
                    break;

                case 2:
                    // Rechercher un département par nom
                    System.out.print("Entrez le nom du département à rechercher: ");
                    String nomRecherche = scanner.nextLine();
                    boolean trouveParNom = departementManager.rechercherDepartement(nomRecherche);
                    System.out.println(trouveParNom ? "Département trouvé." : "Département non trouvé.");
                    break;

                case 3:
                    // Rechercher un département par objet
                    System.out.print("Entrez l'ID du département à rechercher: ");
                    int idRecherche = scanner.nextInt();
                    System.out.print("Entrez le nombre d'employés: ");
                    int nbrEmployeeRecherche = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Entrez le nom du département: ");
                    String nomRechercheObj = scanner.nextLine();
                    Departement departementRecherche = new Departement(idRecherche, nbrEmployeeRecherche, nomRechercheObj);
                    boolean trouveParObjet = departementManager.rechercherDepartement(departementRecherche);
                    System.out.println(trouveParObjet ? "Département trouvé." : "Département non trouvé.");
                    break;

                case 4:
                    // Supprimer un département
                    System.out.print("Entrez l'ID du département à supprimer: ");
                    int idASupprimer = scanner.nextInt();
                    System.out.print("Entrez le nombre d'employés: ");
                    int nbrEmployeeASupprimer = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Entrez le nom du département: ");
                    String nomASupprimer = scanner.nextLine();
                    Departement departementASupprimer = new Departement(idASupprimer, nbrEmployeeASupprimer, nomASupprimer);
                    departementManager.supprimerDepartement(departementASupprimer);
                    System.out.println("Département supprimé !");
                    break;

                case 5:
                    // Afficher tous les départements
                    System.out.println("Liste des départements :");
                    departementManager.displayDepartement();
                    break;

                case 6:
                    // Trier les départements par ID
                    System.out.println("Liste des départements triée par ID :");
                    TreeSet<Departement> sortedDepartements = departementManager.trierDepartementById();

                    //methode 1
                    //sortedDepartements.forEach(System.out::println);

                    //methode 2
                    //Iterator<Departement> iterator = sortedDepartements.iterator();
                    //while (iterator.hasNext()) {
                        //System.out.println(iterator.next());
                    //}

                    //methode 3
                    for (Departement departement : sortedDepartements) {
                        System.out.println(departement);
                    }
                    break;

                case 7:
                    // Quitter
                    System.out.println("Merci d'avoir utilisé le programme.");
                    break;

                default:
                    System.out.println("Choix invalide, veuillez choisir une option entre 1 et 7.");
                    break;
            }
        } while (choix != 7); // Continuer jusqu'à ce que l'utilisateur choisisse de quitter

        scanner.close();
    }
}

