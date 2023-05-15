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
    public void testNumber9()
    {
        String result = IntegerToRoman.convert(9);
        assertEquals(result, "IX");
    }

    @Test
    public void testNumber13()
    {
        String result = IntegerToRoman.convert(13);
        assertEquals(result, "XIII");
    }

    @Test
    public void testNumber18()
    {
        String result = IntegerToRoman.convert(18);
        assertEquals(result, "XVIII");
    }

    @Test
    public void testNumber19()
    {
        String result = IntegerToRoman.convert(19);
        assertEquals(result, "XIX");
    }

    @Test
    public void testNumber20()
    {
        String result = IntegerToRoman.convert(20);
        assertEquals(result, "XX");
    }

    @Test(expected = IllegalArgumentException.class)
        public void testInputNonValido() {
            IntegerToRoman.convert(1001);
        }                     
}