package edu.guilford;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;

public class ScrabbleProjectDriver {
    public static void main(String[] args) throws IOException {
        //Instantiate two ScrabbleSet objects, one for standard English and one using the random constructor.
        ScrabbleSet english = new ScrabbleSet("English");
        //ScrabbleSet random = new ScrabbleSet();

        //Calculate point values using the standard English ScrabbleSet object for a set of at least five test words: blue, lord, bag, shirt, hug
        System.out.println("The point value for the word blue is " + english.getWordScore("blue"));
        System.out.println("The point value for the word sword is " + english.getWordScore("sword"));
        System.out.println("The point value for the word cracker is " + english.getWordScore("cracker"));
        System.out.println("The point value for the word shirt is " + english.getWordScore("shirt"));
        System.out.println("The point value for the word hug is " + english.getWordScore("hug"));

        String filePath = "frankenstein.txt"; // Replace with the actual path to your TXT file

       
    {
        // list that holds strings of a file
        List<String> listOfStrings
            = new ArrayList<String>();
       
        // load data from file
        FileReader fr = new FileReader("frankenstein.txt");
       
        // Created a string to store each character
        // to form word
        String s = new String();
        char ch;
       
        // checking for EOF
        while (fr.ready()) {
            ch = (char)fr.read();
               
            // Used to specify the delimiters
            if (ch == '\n' || ch == ' ' || ch == ',') {
               
                // Storing each string in arraylist
                listOfStrings.add(s.toString());
               
                // clearing content in string
                s = new String();
            }
            else {
                // appending each character to string if the
                // current character is not delimiter
                s += ch;
            }
        }
        if (s.length() > 0) {
           
            // appending last line of strings to list
            listOfStrings.add(s.toString());
        }
        // storing the data in arraylist to array
        String[] array
            = listOfStrings.toArray(new String[0]);
       
        // printing each line of file which is stored in
        // array
        for (String str : array) {
            System.out.println(str);
        }
    }
    //TO FINISH:
    //make above code work and scan
    //randomscrabble set evalute text
    //fix scoring code so that it evaluates whether tiles have been used more than they are present     
        
    }
} 