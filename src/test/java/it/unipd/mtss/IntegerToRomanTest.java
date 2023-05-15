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
    public void testNumber19()
    {
        String result = IntegerToRoman.convert(19);
        assertEquals(result, "XIX");
    }

    @Test
    public void testNumber49()
    {
        String result = IntegerToRoman.convert(49);
        assertEquals(result, "XLIX");
    }

    @Test
    public void testNumber99()
    {
        String result = IntegerToRoman.convert(99);
        assertEquals(result, "XCIX");
    }

    @Test
    public void testNumber499()
    {
        String result = IntegerToRoman.convert(499);
        assertEquals(result, "CDXCIX");
    }

    @Test
    public void testNumber999()
    {
        String result = IntegerToRoman.convert(999);
        assertEquals(result, "CMXCIX");
    }

    @Test(expected = IllegalArgumentException.class)
        public void testInputNonValido() {
            IntegerToRoman.convert(1001);
        }                     
}