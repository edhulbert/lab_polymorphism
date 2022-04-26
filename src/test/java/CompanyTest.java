import animals.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CompanyTest {
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
       frazie = new Owner("Frazie");
       frazoo = new CompanyImpl("Frazoo",frazie);

        frazie.setCompany(frazoo);
        frazie.addPet(lyra = new Dog("Lyra",4,"Labrador",false, true));
        frazie.addPet(lola = new Snake("Lola", 9,"Royal Python",true, false));
        frazie.addPet(beaker = new Chameleon("Beaker", 3,"Panther Chameleon",true));

        frazoo.addCompanyAnimal(tigger = new Salamander("Tigger", 2, "Tiger Salamander", true));
    }

    @Test
    public void canAddCompanyAnimals(){
        assertThat(frazoo.getCompanyAnimals().size()).isEqualTo(3);
    }

    @Test
    public void canRemoveCompanyAnimals(){
        frazoo.removeCompanyAnimal(tigger);
        frazie.removePet(lola);
        frazie.removePet(lyra);
        assertThat(frazoo.getCompanyAnimals().size()).isEqualTo(1);
    }
}
