import com.example.Animal;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestClassAnimal {
    Animal animal = new Animal();

    //Проверка вывода возможных семейств
    @Test
    public void testAnimalKindReturnsCorrectString() {
        assertEquals("Строки не совпали", "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи", animal.getFamily());
    }

    //Проверка вывода исключения в случае несовпадения вида
    @Test
    public void testAnimalGetFoodReturnsCorrectExceptionString(){
        String expected = "Неизвестный вид животного, используйте значение Травоядное или Хищник";
        Exception actual = Assert.assertThrows(Exception.class, () -> animal.getFood("Всеядное"));
        assertEquals("Ответы не совпали", expected, actual.getMessage());
    }
}
