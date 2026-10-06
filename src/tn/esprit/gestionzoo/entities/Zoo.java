package tn.esprit.gestionzoo.entities;

public class Zoo {
    private Animal[] animals = new Animal[25];
    private String name;
    private String city;
    private final int nbrCages;
    private int nbrAnimals;

    public Zoo(String name, String city) {
        setName(name);
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
        if (isZooFull()) {
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
            if (animals[i].getName().equals(animal.getName())) {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public int getNbrAnimals() {
        return nbrAnimals;
    }

    public void setNbrAnimals(int nbrAnimals) {
        this.nbrAnimals = nbrAnimals;
    }
    public int getNbrCages() {
        return nbrCages;
    }
}
