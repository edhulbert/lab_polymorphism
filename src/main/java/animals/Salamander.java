package animals;

import static animals.AnimalType.AMPHIBIAN;

public class Salamander extends Animal{

    private AnimalType animalType;

    public Salamander(String name, int age, String breed, boolean isCompanyAnimal) {
        super(name, age, breed, isCompanyAnimal);

        this.animalType = AMPHIBIAN;
    }

    public AnimalType getAnimalType(){
        return this.animalType;
    }
}
