package animals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static animals.AnimalType.MAMMAL;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AnimalTest {

    Dog dog;

    @BeforeEach
    public void setup(){
        dog = new Dog("Lyra", 4, "Labrador Retriever", false, true);
    }

    @Test
    public void canGetName(){
        assertThat(dog.getName()).isEqualTo("Lyra");
    }

    @Test
    public void canGetAnimalType(){
        assertThat(dog.getAnimalType()).isEqualTo(MAMMAL);
    }

}
