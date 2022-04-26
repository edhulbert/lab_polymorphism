package animals;

public class Snake extends Animal{

    private boolean isVenomous;

    public Snake(String name, int age, String breed, boolean isCompanyAnimal, boolean isVenomous) {
        super(name, age, breed, isCompanyAnimal);
        this.isVenomous = isVenomous;
    }


}
