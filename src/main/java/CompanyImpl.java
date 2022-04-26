import animals.Animal;
import interfaces.ICompany;

import java.util.ArrayList;
import java.util.List;

public class CompanyImpl implements ICompany {

    private String name;
    private List<Animal> companyAnimals;
    private Owner owner;

    public CompanyImpl(String name, Owner owner) {
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

    public void removeCompanyAnimal(Animal animal) {
        this.companyAnimals.remove(animal);
    }
}

