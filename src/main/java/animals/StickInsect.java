package animals;

import static animals.AnimalType.INVERTEBRATE;

public class StickInsect extends Animal {

    private AnimalType animalType;

    public StickInsect(String name, int age, String breed, boolean isCompanyAnimal) {
        super(name, age, breed, isCompanyAnimal);

        this.animalType = INVERTEBRATE;
    }
    public AnimalType getAnimalType(){
        return this.animalType;
    }
}
