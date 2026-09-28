import java.util.Scanner;

public class ZooManagement {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Veuillez entrer le nom du zoo");
        String zooName = sc.nextLine();

        int nbrCages;

        do {
            System.out.println("Entrez le nombre de cages :");
            nbrCages=sc.nextInt();
        }while (nbrCages<=0);

        System.out.println(" Le Zoo "+zooName+" est composé de "+nbrCages+" cages");


        Animal lion = new Animal("Félin", "Simba", 5, true);

        Zoo myZoo = new Zoo("Zoo de Tunis", "Tunis", 10);
        Animal tigre = new Animal("Félin", "Rajah", 4, true);
        Animal perroquet = new Animal("Oiseau", "Polly", 2, false);
        Animal serpent = new Animal("Reptile", "Kaa", 4, false);

        myZoo.animals[0] = lion;
        myZoo.animals[1] = tigre;
        myZoo.animals[2] = perroquet;
        myZoo.animals[3] = serpent;

        myZoo.displayZoo();
        System.out.println(myZoo);
        System.out.println("----------------");
        System.out.println(lion);








    }

}