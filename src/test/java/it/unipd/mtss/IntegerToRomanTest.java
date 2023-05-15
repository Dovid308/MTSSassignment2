////////////////////////////////////////////////////////////////////
// Giacomo D'Ovidio 2009101
// Davide Malgarise 2009994
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.*;

import org.junit.Test;

public class IntegerToRomanTest 
{

    @Test
    public void testNumber0()
    {
        String result = IntegerToRoman.convert(0);
        assertEquals(result, "");
    }

    @Test
    public void testNumber1()
    {
        String result = IntegerToRoman.convert(1);
        assertEquals(result, "I");
    }

    @Test
    public void testNumber2()
    {
        String result = IntegerToRoman.convert(2);
        assertEquals(result, "II");
    }

    @Test
    public void testNumber3()
    {
        String result = IntegerToRoman.convert(3);
        assertEquals(result, "III");
    }

    @Test(expected = IllegalArgumentException.class)
        public void testInputNonValido() {
            IntegerToRoman.convert(20);
        }                     
}