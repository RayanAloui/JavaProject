import java.util.Scanner;

public class ZooManagement {
    //private int nbrCages =20;
    //private String zooName = "my zoo";

    private int nbrCages;
    private String zooName;

    public static void main(String[] args){
        ZooManagement zoo = new ZooManagement();
        zoo.recevoirInfo();
        zoo.affichageInfo();
    }

    public void recevoirInfo(){
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.print("Entrez le nom du zoo (des lettres seulement) : ");
            zooName = scanner.nextLine();
        }while(!zooName.matches("^[a-zA-Z\\s]+$"));

        System.out.print("Entrez le nombre de cages : ");
        nbrCages = scanner.nextInt();
        while(nbrCages <= 0){
            System.out.print("Le nombre de cages doit etre positif ! Reessayez : ");
            nbrCages = scanner.nextInt();
        }

        scanner.close();
    }

    public void affichageInfo(){
        System.out.println(zooName + " comporte " + nbrCages + " cages");
    }
}
