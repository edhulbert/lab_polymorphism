package animals;

public class Cat extends Animal{

    private boolean isLongHair;

    public Cat(String name, int age, String breed, boolean isCompanyAnimal, boolean isLongHair) {
        super(name, age, breed, isCompanyAnimal);
        this.isLongHair = isLongHair;
    }



}
