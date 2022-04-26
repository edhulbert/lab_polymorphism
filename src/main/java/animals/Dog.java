package animals;

import static animals.AnimalType.MAMMAL;

public class Dog extends Animal{

    private boolean isWorkingBreed;
    private AnimalType animalType;

    public Dog(String name, int age, String breed, boolean isCompanyAnimal, boolean isWorkingBreed) {
        super(name, age, breed, isCompanyAnimal);
        this.isWorkingBreed = isWorkingBreed;
        this.animalType = MAMMAL;
    }

    public boolean getIsWorkingBreed() {
        return this.isWorkingBreed;
    }

    public String takeForWalk(){
        return this.getName() + " has been taken for a walk";
    }

    public AnimalType getAnimalType(){
        return this.animalType;
    }
}
