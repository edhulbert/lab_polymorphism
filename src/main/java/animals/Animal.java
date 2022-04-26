package animals;

public abstract class Animal {

    private String name;
    private int age;
    private String breed;
    private boolean isCompanyAnimal;

    public Animal(String name, int age, String breed, boolean isCompanyAnimal) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.isCompanyAnimal = isCompanyAnimal;
    }

    //GETTERS AND SETTERS
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getBreed() {
        return this.breed;
    }

    public boolean getIsCompanyAnimal() {
        return this.isCompanyAnimal;
    }

    public void setIsCompanyAnimal(boolean isCompanyAnimal) {
        this.isCompanyAnimal = isCompanyAnimal;
    }

    public String feed() {
        return this.getName() + " has been fed)";
    }

    public String feed(String food) {
        return this.getName() + " has been fed " + food;
    }

}
