import animals.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class OwnerTest {
    private Owner frazie;
    private CompanyImpl frazoo;
    private Dog lyra;
    private Cat pan;
    private Cat sherlock;
    private Snake lola;
    private Chameleon beaker;
    private Salamander tigger;
    private StickInsect mabel;

    @BeforeEach
    public void setup(){
        frazie = new Owner("Frazie Hulbert");

        frazoo = new CompanyImpl("Frazoo", frazie);

        frazie.setCompany(frazoo);
        frazie.addPet(lyra = new Dog("Lyra",4,"Labrador",false, true));
        frazie.addPet(pan = new Cat("Pantaleimon",2,"Ragdoll/Russian Blue",false, false ));
        frazie.addPet(sherlock = new Cat("Sherlock",7,"Persian", false, false));
        frazie.addPet(lola = new Snake("Lola", 9,"Royal Python",true, false));
        frazie.addPet(beaker = new Chameleon("Beaker", 3,"Panther Chameleon",true));
        frazie.addPet(mabel = new StickInsect("Mabel", 1, "Giant Asian Rainforest Mantis", true));
        frazie.addPet(tigger = new Salamander("Tigger", 2, "Tiger Salamander",true));

    }

    @Test
    public void addsPets(){
        assertThat(frazie.pets.size()).isEqualTo(7);
    }

    @Test
    public void hasCompanyPets() {
        assertThat(frazoo.getCompanyAnimals().size()).isEqualTo(4);
    }



}
