import animals.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class OwnerTest {
    private Owner frazie;
    private Company frazoo;
    private Dog lyra;
    private Cat pan;
    private Cat sherlock;
    private Snake lola;
    private Chameleon beaker;

    @BeforeEach
    public void setup(){
        frazie = new Owner("Frazie Hulbert");

        frazoo = new Company("Frazoo", frazie);

        frazie.setCompany(frazoo);
        frazie.addPet(lyra = new Dog("Lyra",4,"Labrador",false,true));
        frazie.addPet(pan = new Cat("Pantaleimon",2,"Ragdoll/Russian Blue", false, false));
        frazie.addPet(sherlock = new Cat("Sherlock",7,"Persian", false, false));
        frazie.addPet(lola = new Snake("Lola", 9,"Royal Python",true, false));
        frazie.addPet(beaker = new Chameleon("Beaker", 3,"Panther Chameleon",true));
    }

    @Test
    public void addsPets(){
        assertThat(frazie.allAnimals.size()).isEqualTo(5);
    }

    @Test
    public void hasCompanyPets() {
        assertThat(frazoo.getCompanyAnimals().size()).isEqualTo(2);
    }
}
