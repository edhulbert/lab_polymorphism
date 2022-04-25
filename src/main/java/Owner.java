import animals.Animal;

import java.util.ArrayList;
import java.util.List;

public class Owner {

    private String name;
    protected List<Animal> allAnimals;
    protected List<Animal> companyAnimals;
    private Company company;

    public Owner(String name) {
        this.name = name;
        this.allAnimals = new ArrayList<Animal>();
//        this.companyAnimals = new ArrayList<Animal>();
    }

    public void setCompany(Company company){
        this.company = company;
    }

    public void addPet(Animal animal) {
        if (animal.getIsCompanyAnimal()){
            allAnimals.add(animal);
            company.addCompanyAnimal(animal);
        } else {
            allAnimals.add(animal);
        }

    }
}
