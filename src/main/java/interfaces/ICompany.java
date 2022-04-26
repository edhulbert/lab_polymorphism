package interfaces;

import animals.Animal;

import java.util.List;

public interface ICompany {

    public List<Animal> getCompanyAnimals();

    public void addCompanyAnimal(Animal animal);

    public void removeCompanyAnimal(Animal animal);

}

