////////////////////////////////////////////////////////////////////
// Giacomo D'Ovidio 2009101
// Davide Malgarise 2009994
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {

    public static String convert(int number) throws IllegalArgumentException {
        String s = "L'intero deve essere compreso tra 0 e 6";
        if(number < 0 || number > 6) {
            throw new IllegalArgumentException(s);
        }

        String roman = "";

        while (number >= 5) {
            roman += "V";
            number = number - 5;
        }
        while (number >= 4) {
            roman += "IV";
            number = number - 4;
        }  
        while(number >= 1){
            roman = roman + "I";
            number = number - 1;
        }

        return roman;
    }
}