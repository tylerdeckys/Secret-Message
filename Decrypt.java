/*
 * CS1050 - Computer Science I - Fall 2020
 * Instructor: Thyago Mota
 * Description: Activity 18 - Decrypt
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Decrypt {

    public static void main(String[] args) throws FileNotFoundException {

        // TODO: open the "encrypted.txt" file
Scanner in = new Scanner(new FileInputStream("encrypted.txt"));
        
        // TODO: create an output string
    String out = "";

        // TODO: read one line at a time using a loop
while (in.hasNext()){

   String line = in.nextLine();
    
            // TODO: read one character at a time using a 2nd loop
for (int i = 0; i < line.length(); i++) {
 char c = line.charAt(i);
}

                // TODO: if the character is a period, write a space in the output string

                // TODO: else, if the character is a space, write a dash in the output string

                // TODO: else, write the character that is 10 codes less in the output string

                     }

            // TODO: display the output string


        // TODO: close the input file
    }
}
