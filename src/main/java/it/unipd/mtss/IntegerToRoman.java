////////////////////////////////////////////////////////////////////
// Giacomo D'Ovidio 2009101
// Davide Malgarise 2009994
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {

    public static String convert(int number) throws IllegalArgumentException {
        String s = "L'intero deve essere compreso tra 0 e 500";
        if(number < 0 || number > 500) {
            throw new IllegalArgumentException(s);
        }

        String roman = "";

        String[] numeriRomani =
         {"D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] numeriArabi =
        {500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        int i=0;

        while (number > 0) {
            while (number >= numeriArabi[i]) {
                
                roman += numeriRomani[i];
                number -= numeriArabi[i];
            }
            i++;
        }

        return roman;
    }
}