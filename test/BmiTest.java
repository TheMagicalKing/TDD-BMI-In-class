import junit.framework.TestCase;

public class BmiTest extends TestCase {


    public void testBmiBeregning() {
        // tage imod højde i meter og vægt kg
        double resultat;
        resultat = Bmi.bmiBeregning(1.85, 95);
        assertEquals(27.8, resultat);
    }
}