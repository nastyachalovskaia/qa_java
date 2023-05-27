import com.example.Feline;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestClassFeline {
    Feline feline = new Feline();

    //Проверка семейства
    @Test
    public void testIsFeline() {
        assertEquals("Некорректный вид", "Кошачьи", feline.getFamily());

    }

    //Проверка рациона
    @Test
    public void testFelineEatsMeet() throws Exception {
        assertEquals("Кошачьи не так питаются", List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    //Проверка
    @Test
    public void testKittensCountWithoutParameters() {
        assertEquals("Некорректное количество котят", 1, feline.getKittens());
    }

    //Проверка возвращаеого значения котят методом с параметрами
    @Test
    public void testKittensCountWithParameters() {
        assertEquals("Некорректное количество котят", 5, feline.getKittens(5));
    }
}
