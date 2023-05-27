import com.example.Cat;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestClassCat {
    Cat cat;

    @Before
    public void createObjectsForTestClass() {
        Feline feline = new Feline();
        cat = new Cat(feline);
    }

    //Проверка издаваемого кошачьим звука
    @Test
    public void testIsCatMakingCorrectSound() {
        assertEquals("Кот издаёт странные звуки...","Мяу", cat.getSound());
    }

    //Проверка кота на хищность
    @Test
    public void testIsCatPredator() throws Exception {
        assertEquals("Какой-то у вас неправильный кот", List.of( "Животные", "Птицы", "Рыба"),cat.getFood());
    }
}
