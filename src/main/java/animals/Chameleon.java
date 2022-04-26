package animals;

import static animals.AnimalType.REPTILE;

public class Chameleon extends Animal{

    private AnimalType animalType;

    public Chameleon(String name, int age, String breed, boolean isCompanyAnimal) {
        super(name, age, breed, isCompanyAnimal);

        this.animalType = REPTILE;
    }

    public AnimalType getAnimalType(){
        return this.animalType;
    }

}
