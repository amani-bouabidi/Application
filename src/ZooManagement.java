
import java.util.Scanner;

public class ZooManagement {

    // Instruction 1 :
    int nbrCages = 20;
    String zooName = "my zoo";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ZooManagement zoo = new ZooManagement();

        // Instruction 1 :
        System.out.println(zoo.zooName + " comporte " + zoo.nbrCages + " cages");

        // Instruction 2 :
        System.out.print("Entrez le nom du zoo : ");
        zoo.zooName = scanner.nextLine();

        while (zoo.zooName.trim().isEmpty()) {
            System.out.print("Le nom du zoo ne peut pas être vide. Entrez le nom du zoo : ");
            zoo.zooName = scanner.nextLine();
        }

        System.out.print("Entrez le nombre de cages : ");

        while (!scanner.hasNextInt()) {
            System.out.print("Veuillez entrer un entier positif : ");
            scanner.next();
        }

        zoo.nbrCages = scanner.nextInt();

        while (zoo.nbrCages <= 0) {
            System.out.print("Le nombre de cages doit être positif. Entrez le nombre de cages : ");
            zoo.nbrCages = scanner.nextInt();
        }

        // Instruction 3 :
        System.out.println(zoo.zooName + " comporte " + zoo.nbrCages + " cages");
        scanner.close();
    }
}

