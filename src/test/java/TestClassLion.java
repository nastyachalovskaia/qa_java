import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestClassLion {
    Feline feline = new Feline();

    //Проверка рациона льва
    @Test
    public void testLionEatsRightFood() throws Exception {
        Lion lion = new Lion("Самец", feline);
        assertEquals("Интересный лев у вас...", List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }

    //Проверка пола льва
    @Test
    public void testLionSexException() {
        String expected = "Используйте допустимые значения пола животного - самец или самка";
        Exception actual = Assert.assertThrows(Exception.class, () -> new Lion("Не скажу", feline));
        assertEquals("Ответы не совпали", expected, actual.getMessage());
    }
}
