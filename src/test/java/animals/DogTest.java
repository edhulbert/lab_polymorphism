package animals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static animals.AnimalType.MAMMAL;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class DogTest {

    Dog dog;

    @BeforeEach
    public void setup(){
        dog = new Dog("Lyra", 4, "Labrador Retriever", false,  true);
    }

    @Test
    public void canGetName(){
        assertThat(dog.getName()).isEqualTo("Lyra");
    }

    @Test
    public void isCompanyAnimalCorrect() {
        assertThat(dog.getIsCompanyAnimal()).isEqualTo(false);
    }

    @Test
    public void hasWorkingBreed() {
        assertThat(dog.getIsWorkingBreed()).isEqualTo(true);
    }

    @Test
    public void canBeFed() {
        assertThat(dog.feed()).isEqualTo("Lyra has been fed");
    }

    @Test
    public void canBeFedSpecific(){
        assertThat(dog.feed("treat")).isEqualTo("Lyra has been fed treat");
    }

    @Test
    public void canGetAnimalType() {
        assertThat(dog.getAnimalType()).isEqualTo(MAMMAL);
    }


}
