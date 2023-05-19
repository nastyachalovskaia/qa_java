import com.example.Animal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParameterizedTestClassAnimal {

    private final String animalKind;
    private final List<String> expectedFood;

    public ParameterizedTestClassAnimal(String animalKind, List<String> expectedFood) {
        this.animalKind = animalKind;
        this.expectedFood = expectedFood;
    }

    @Parameterized.Parameters
    public static Object[][] animalFoodConsumers() {
        return new Object[][]{
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")},
        };
    }

    @Test
    public void shouldCorrespondsToFoodConsumers() throws Exception {
        Animal animal = new Animal();
        assertEquals(expectedFood, animal.getFood(animalKind));
    }
}
