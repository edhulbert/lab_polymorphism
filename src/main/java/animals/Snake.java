package animals;

import static animals.AnimalType.REPTILE;

public class Snake extends Animal{

    private boolean isVenomous;

    private AnimalType animalType;

    public Snake(String name, int age, String breed, boolean isCompanyAnimal, boolean isVenomous) {
        super(name, age, breed, isCompanyAnimal);
        this.isVenomous = isVenomous;

        this.animalType = REPTILE;
    }

    public AnimalType getAnimalType(){
        return this.animalType;
    }

}
