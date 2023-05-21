import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParameterizedTestClassLion {
    private String sex;
    private boolean hasMane;
    Feline feline = new Feline();

    public ParameterizedTestClassLion(String sex, boolean isMane) {
        this.sex = sex;
        this.hasMane = isMane;
    }

    @Parameterized.Parameters
    public static Object[][] shouldHaveMane() {
        return new Object[][]{
                {"Самец", Boolean.TRUE},
                {"Самка", Boolean.FALSE},
        };
    }

    @Test
    public void testLionHasMane() throws Exception{
        Lion lion = new Lion(sex, feline);
        assertEquals("Пол не совпал", hasMane, lion.doesHaveMane());
    }
}
