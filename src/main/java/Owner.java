import animals.Animal;
import interfaces.ICompany;

import java.util.ArrayList;
import java.util.List;

public class Owner {

    private String name;
    protected List<Animal> pets;
    private ICompany company;

    public Owner(String name) {
        this.name = name;
        this.pets = new ArrayList<Animal>();
    }

    public void setCompany(ICompany company){
        this.company = company;
    }

    public ICompany getCompany() {
        return this.company;
    }

    public List<Animal> getPets() {
        return this.pets;
    }

    public void addPet(Animal animal) {
        if (animal.getIsCompanyAnimal()){
            pets.add(animal);
            company.addCompanyAnimal(animal);
        } else {
            pets.add(animal);
        }
    }

    public void removePet(Animal animal) {
        pets.remove(animal);
        company.removeCompanyAnimal(animal);
    }
}
