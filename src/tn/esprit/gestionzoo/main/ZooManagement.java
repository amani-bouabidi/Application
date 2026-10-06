package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;
import java.util.Scanner;

public class ZooManagement {


    public static void main(String[] args) {
        /*   int nbrCages=20;
        String zooName="my tn.esprit.gestionzoo.entities.Zoo";

        System.out.println(" Le tn.esprit.gestionzoo.entities.Zoo "+zooName+" est composé de "+nbrCages+" cages");
*/
        Scanner sc = new Scanner(System.in);

        System.out.println("Veuillez entrer le nom du zoo");
        String zooName = sc.nextLine();

        int nbrCages;

        do {
            System.out.println("Entrez le nombre de cages :");
            nbrCages=sc.nextInt();
        }while (nbrCages<=0);

        System.out.println(" Le tn.esprit.gestionzoo.entities.Zoo "+zooName+" est composé de "+nbrCages+" cages");

        Zoo myZoo = new Zoo("tn.esprit.gestionzoo.entities.Zoo de Tunis", "Tunis");
        Animal lion = new Animal("Félin", "Simba", 5, true);
        Animal tigre = new Animal("Félin", "Rajah", 4, true);
        Animal perroquet = new Animal("Oiseau", "Polly", 2, false);
        Animal serpent = new Animal("Reptile", "Kaa", 4, false);

        myZoo.displayZoo();
        System.out.println(myZoo);
        System.out.println("----------------");
        System.out.println(lion);

        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(tigre));
        System.out.println(myZoo.addAnimal(perroquet));

        myZoo.displayAnimals();

        int resultat = myZoo.searchAnimal(lion);
        System.out.println("Indice du lion : " + resultat);

        Animal lion2 = new Animal("Félin", "Simba", 5, true);

        int resultat2 = myZoo.searchAnimal(lion2);
        System.out.println("Indice du deuxième lion : " + resultat2);

        System.out.println("Suppression du tigre : " + myZoo.removeAnimal(tigre));
        System.out.println("Après la suppression :");
        myZoo.displayAnimals();


        System.out.println("Le zoo est plein : " + myZoo.isZooFull());
        Zoo zoo1 = new Zoo("tn.esprit.gestionzoo.entities.Zoo de Tunis", "Tunis");
        Zoo zoo2 = new Zoo("tn.esprit.gestionzoo.entities.Zoo de Sousse", "Sousse");

        zoo1.addAnimal(lion);
        zoo1.addAnimal(tigre);
        zoo1.addAnimal(perroquet);

        zoo2.addAnimal(serpent);

        Zoo resultat1 = zoo1.comparerZoo(zoo1, zoo2);

        System.out.println("Le zoo qui contient le plus d'animaux est :" + resultat1);

    }

}