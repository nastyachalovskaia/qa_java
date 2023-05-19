import com.example.Animal;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestClassAnimal {
    Animal animal = new Animal();

    //проверка вывода возможных семейств
    @Test
    public void testAnimalKindReturnsCorrectStringResult() {
        assertEquals("Некорректное семейство", "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи", animal.getFamily());
    }

    //проверка вывода исключения в случае несовпадения вида
    @Test
    public void testAnimalGetFoodThrowsException(){
        String expected = "Некорректный вид животного, возможные значения: Травоядное или Хищник";
        Exception actual = Assert.assertThrows(Exception.class, () -> animal.getFood("Всеядное"));
        assertEquals("Ответы не совпали", expected, actual.getMessage());
    }
}
