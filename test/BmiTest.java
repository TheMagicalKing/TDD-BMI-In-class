import junit.framework.TestCase;


public class BmiTest extends TestCase {

    /** Tester András vægt*/
    public void testBmiBeregning() {
        double resultat;
        resultat = Bmi.bmiBeregning(1.85, 95);
        assertEquals(27.8, resultat);
        resultat = Bmi.bmiBeregning(1.80, 80.75);
        assertEquals(24.9, resultat);
        resultat = Bmi.bmiBeregning(2.10, 120.5);
        assertEquals(27.3, resultat);

    }
    /** Tester maximum højde og vægt */
    public void testBmiBeregningMaximum() {
        double resultat;
        resultat = Bmi.bmiBeregning(3.01, 95);
        assertEquals(-1.0, resultat);
        resultat = Bmi.bmiBeregning(2.0, 750.01);
        assertEquals(-1.0, resultat);
    }

    /** Tester minimum højde og vægt */
    public void testBmiBeregningMinimum() {
        double resultat;
        resultat = Bmi.bmiBeregning(0.001, 95);
        assertEquals(-1.0, resultat);
        resultat = Bmi.bmiBeregning(1.80, 19);
        assertEquals(-1.0, resultat);
    }

    /** Tester 0 som højde og vægt*/
    public void testBmiBeregningDivisionBy0() {
        double resultat;
        resultat = Bmi.bmiBeregning(0.0, 95);
        assertEquals(-1.0, resultat);
        resultat = Bmi.bmiBeregning(1.80, 0);
        assertEquals(-1.0, resultat);
    }
    /** Tester BMI  klasser**/
    public void testBmiBeregningVægtKlasse(){
        double resultat;
        resultat = Bmi.bmiBeregning(1.80,55.0);
        assertEquals(17.0, resultat);
        resultat = Bmi.bmiBeregning(1.80,60.0);
        assertEquals(18.5, resultat);
        resultat = Bmi.bmiBeregning(1.80,82.0);
        assertEquals(25.3, resultat);
        resultat = Bmi.bmiBeregning(1.80,98.0);
        assertEquals(30.2, resultat);
        resultat = Bmi.bmiBeregning(1.80,140.0);
        assertEquals(43.2, resultat);




    }

}