import animals.Animal;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private String name;
    private List<Animal> companyAnimals;
    private Owner owner;

    public Company(String name, Owner owner) {
        this.name = name;
        this.companyAnimals = new ArrayList<Animal>();
    }

    public Owner getOwner(){
        return this.owner;
    }

    public String getName() {
        return name;
    }

    public List<Animal> getCompanyAnimals() {
        return this.companyAnimals;
    }

    public void addCompanyAnimal(Animal animal) {
        this.companyAnimals.add(animal);
    }
}

