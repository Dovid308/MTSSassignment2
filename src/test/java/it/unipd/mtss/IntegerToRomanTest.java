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
    public void testNumber3()
    {
        String result = IntegerToRoman.convert(3);
        assertEquals(result, "III");
    }

    @Test
    public void testNumber6()
    {
        String result = IntegerToRoman.convert(6);
        assertEquals(result, "VI");
    }

    @Test
    public void testNumber8()
    {
        String result = IntegerToRoman.convert(8);
        assertEquals(result, "VIII");
    }

    @Test
    public void testNumber9()
    {
        String result = IntegerToRoman.convert(9);
        assertEquals(result, "IX");
    }

    @Test
    public void testNumber10()
    {
        String result = IntegerToRoman.convert(10);
        assertEquals(result, "X");
    }

    @Test(expected = IllegalArgumentException.class)
        public void testInputNonValido() {
            IntegerToRoman.convert(1001);
        }                     
}