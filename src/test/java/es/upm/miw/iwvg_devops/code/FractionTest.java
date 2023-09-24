package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FractionTest {
    private Fraction fraction;

    @BeforeEach
    void before() {
        fraction = new Fraction(2, 4);
    }

    @Test
    void testFractionIs1_1() {
        assertEquals(1, new Fraction().getNumerator());
        assertEquals(1, new Fraction().getDenominator());
    }

    @Test
    void testSetFractionNumerator(){
        fraction.setNumerator(0);
        assertEquals(0, fraction.getNumerator());
    }

    @Test
    void testSetFractionDenominator(){
        fraction.setDenominator(5);
        assertEquals(5, fraction.getDenominator());
    }

    @Test
    void testGetFractionDecimal(){
        assertEquals(0.5, fraction.decimal());
    }

    @Test
    void testFractionToString(){
        assertEquals("Fraction{numerator=2, denominator=4}", fraction.toString());
    }


}
