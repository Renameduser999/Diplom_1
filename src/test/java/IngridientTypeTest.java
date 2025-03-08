import org.junit.Test;
import praktikum.IngredientType;

import static org.junit.Assert.assertNotNull;



public class IngridientTypeTest {

    @Test
    public void SAUCETest(){
        assertNotNull("Опаньки, где-то ошибка", IngredientType.SAUCE);
    }

    @Test
    public void FILLINGTest() {
        assertNotNull("Опаньки, где-то ошибка", IngredientType.FILLING);
    }
}
