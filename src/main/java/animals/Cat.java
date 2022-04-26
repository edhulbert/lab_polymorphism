package animals;

import static animals.AnimalType.MAMMAL;

public class Cat extends Animal{

    private boolean isLongHair;
    private AnimalType animalType;

    public Cat(String name, int age, String breed, boolean isCompanyAnimal, boolean isLongHair) {
        super(name, age, breed, isCompanyAnimal);
        this.isLongHair = isLongHair;
        this.animalType = MAMMAL;
    }

    public AnimalType getAnimalType(){
        return this.animalType;
    }

}
