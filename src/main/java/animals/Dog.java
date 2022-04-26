package animals;

public class Dog extends Animal{

    private boolean isWorkingBreed;

    public Dog(String name, int age, String breed, boolean isCompanyAnimal, boolean isWorkingBreed) {
        super(name, age, breed, isCompanyAnimal);
        this.isWorkingBreed = isWorkingBreed;
    }

    public boolean getIsWorkingBreed() {
        return this.isWorkingBreed;
    }

    public String takeForWalk(){
        return this.getName() + " has been taken for a walk";
    }
}
