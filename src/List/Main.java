package List;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nMenu de gestion des employés");
            System.out.println("1. Ajouter un employé");
            System.out.println("2. Rechercher un employé par nom");
            System.out.println("3. Rechercher un employé par instance");
            System.out.println("4. Supprimer un employé");
            System.out.println("5. Afficher tous les employés");
            System.out.println("6. Trier les employés par ID");
            System.out.println("7. Trier les employés par nom de département et grade");
            System.out.println("8. Quitter");
            System.out.print("Choisissez une option: ");
            int choix = scanner.nextInt();
            scanner.nextLine(); // Consomme la nouvelle ligne

            switch (choix) {
                case 1:
                    System.out.print("Entrez l'ID: ");
                    int id = scanner.nextInt();
                    System.out.print("Entrez le grade: ");
                    int grade = scanner.nextInt();
                    scanner.nextLine(); // Consomme la nouvelle ligne
                    System.out.print("Entrez le nom: ");
                    String nom = scanner.nextLine();
                    System.out.print("Entrez le prénom: ");
                    String prenom = scanner.nextLine();
                    System.out.print("Entrez le département: ");
                    String departement = scanner.nextLine();

                    Employe employe = new Employe(id, grade, nom, prenom, departement);
                    societe.ajouterEmploye(employe);
                    System.out.println("Employé ajouté avec succès!");
                    break;
                case 2:
                    System.out.print("Entrez le nom de l'employé à rechercher: ");
                    String nomRecherche = scanner.nextLine();
                    boolean trouveNom = societe.rechercherEmploye(nomRecherche);
                    System.out.println(trouveNom ? "Employé trouvé." : "Employé non trouvé.");
                    break;
                case 3:
                    System.out.print("Entrez l'ID de l'employé à rechercher: ");
                    int idRecherche = scanner.nextInt();
                    scanner.nextLine(); // Consomme la nouvelle ligne
                    System.out.print("Entrez le nom: ");
                    String nomRechercheInstance = scanner.nextLine();
                    Employe employeRecherche = new Employe(idRecherche, 0, nomRechercheInstance, "", "");
                    boolean trouveInstance = societe.rechercherEmploye(employeRecherche);
                    System.out.println(trouveInstance ? "Employé trouvé." : "Employé non trouvé.");
                    break;
                case 4:
                    System.out.print("Entrez l'ID de l'employé à supprimer: ");
                    int idSuppression = scanner.nextInt();
                    scanner.nextLine(); // Consomme la nouvelle ligne
                    System.out.print("Entrez le nom: ");
                    String nomSuppression = scanner.nextLine();
                    Employe employeSuppression = new Employe(idSuppression, 0, nomSuppression, "", "");
                    societe.supprimerEmploye(employeSuppression);
                    System.out.println("Employé supprimé (s'il existait).");
                    break;
                case 5:
                    System.out.println("Liste des employés:");
                    societe.displayEmploye();
                    break;
                case 6:
                    societe.trierEmployeParId();
                    System.out.println("Employés triés par ID.");
                    break;
                case 7:
                    societe.trierEmployeParNomDepartementEtGrade();
                    System.out.println("Employés triés par nom de département et grade.");
                    break;
                case 8:
                    running = false;
                    System.out.println("Au revoir!");
                    break;
                default:
                    System.out.println("Option invalide. Veuillez réessayer.");
                    break;
            }
        }
        scanner.close();
    }
}

