package test;

import demo.parallel.Complex;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {

    @org.junit.jupiter.api.Test
    void minus() {

        Complex a = new Complex(5, 3);
        Complex b = new Complex(3, 1);

        Complex result = a.minus(b);

        Complex expected = new Complex(2, 2);

        assertEquals(expected.getRe(), result.getRe());
        assertEquals(expected.getIm(), result.getIm());
    }
}