public class Zoo {
    Animal[] animals = new Animal[25];
    String name;
    String city;
    final int nbrCages;
    int nbrAnimals;

    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        this.nbrCages = 25;
    }

    public void displayZoo() {
        System.out.println("Nom du zoo : " + name);
        System.out.println("Ville : " + city);
        System.out.println("Nombre de cages : " + nbrCages);
    }

    public String toString() {
        return "Nom du zoo : " + name +
                "\nVille : " + city +
                "\nNombre de cages : " + nbrCages;
    }

    public boolean addAnimal(Animal animal) {

        // Vérifier si l'animal existe déjà
        if (searchAnimal(animal) != -1) {
            return false;
        }

        // Vérifier si le zoo est plein
        if (nbrAnimals >= animals.length) {
            return false;
        }

        // Ajouter l'animal
        animals[nbrAnimals] = animal;
        nbrAnimals++;

        return true;
    }

    public void displayAnimals() {
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i].name.equals(animal.name)) {
                return i;
            }
        }
        return -1;
    }

    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);

        if (index == -1) {
            return false;
        }

        for (int i = index; i < nbrAnimals - 1; i++) {
            animals[i] = animals[i + 1];
        }

        animals[nbrAnimals - 1] = null;
        nbrAnimals--;

        return true;
    }

    public boolean isZooFull() {
        return nbrAnimals >= nbrCages;
    }

    public Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals >= z2.nbrAnimals) {
            return z1;
        } else {
            return z2;
        }
    }
}
