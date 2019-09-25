import junit.framework.TestCase;

public class FactorialTest extends TestCase {

    //Test cases for Factorial regnefunktion. !4 = 1*2*3*4...()

    // Tester for factorial helt tal
    public void testFactorialBeregningHeltTal(){
        int resultat;
        resultat=Factorial.factorialBeregningHeltTal(5);
        assertEquals(120,resultat);
        }

    // Tester for factorial minus-værdi
    public void testFactorialBeregningMinusVaerdi() {
        int resultat;
        resultat = Factorial.factorialBeregningHeltTal(-5);
        assertEquals(-120, resultat);
    }
        /**

// Tester for factorial decimal-tal (ugyldigt)
    public void testFactorialBeregningDecimalTal() {
        double resultat;
        resultat = Factorial.factorialBeregningHeltTal(5.5);
        assertEquals(-1, resultat);
        */

    // Tester for factorial med værdien 0
        public void testFactorialBeregningNul() {
            int resultat;
            resultat = Factorial.factorialBeregningHeltTal(0);
            assertEquals(1, resultat);
        }
}