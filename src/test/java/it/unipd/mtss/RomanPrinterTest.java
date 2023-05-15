////////////////////////////////////////////////////////////////////
// Giacomo D'Ovidio 2009101
// Davide Malgarise 2009994
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;
import static org.junit.Assert.*;


import org.junit.Test;



import org.mockito.MockedStatic;
import org.mockito.Mockito;

 public class RomanPrinterTest 
{


    @Test(expected = IllegalArgumentException.class)
    public void testoimputnegativo_conmockito(){
        try(MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)){
            utilities.when(()->IntegerToRoman.convert(-1)).thenThrow(IllegalArgumentException.class);
            RomanPrinter.print(-1);}}
    
    @Test
    public void testolastampadelnumero0_conmockito(){
        try(MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)){
            utilities.when(()->IntegerToRoman.convert(0)).thenReturn(""); 
            assertEquals("", RomanPrinter.print(0));
    }}
    @Test
    public void testolastampadelnumero3_conmockito(){

        String pattern =
                 " __   __   __  \n" +
                 "|  | |  | |  | \n" +
                 "|  | |  | |  | \n" +
                 "|  | |  | |  | \n" +
                 "|  | |  | |  | \n" +
                 "|__| |__| |__| ";
                      
    try(MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)){
        utilities.when(()->IntegerToRoman.convert(3)).thenReturn("III"); 
        assertEquals(pattern, RomanPrinter.print(3));

    }}

    @Test
    public void testolastampadelnumero4_conmockito(){

        String pattern = " __  ____    ____ \n" +
             "|  | \\   \\  /   / \n" +
             "|  |  \\   \\/   /  \n" +
             "|  |   \\      /   \n" +
             "|  |    \\    /    \n" +
             "|__|     \\__/     ";
        
                      
    try(MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)){
        utilities.when(()->IntegerToRoman.convert(4)).thenReturn("IV"); 
        assertEquals(pattern, RomanPrinter.print(4));

    }}
    

    
    
    
}