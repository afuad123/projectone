package edu.guilford;

public class ScrabbleProjectDriver {
    public static void main(String[] args) {
        //Instantiate two ScrabbleSet objects, one for standard English and one using the random constructor.
        ScrabbleSet english = new ScrabbleSet("English");
        //ScrabbleSet random = new ScrabbleSet();

        //Calculate point values using the standard English ScrabbleSet object for a set of at least five test words: blue, lord, bag, shirt, hug
        System.out.println("The point value for the word blue is " + english.getWordScore("blue"));
        System.out.println("The point value for the word lord is " + english.getWordScore("sword"));
        System.out.println("The point value for the word bag is " + english.getWordScore("crackerjack"));
        System.out.println("The point value for the word shirt is " + english.getWordScore("shirt"));
        System.out.println("The point value for the word hug is " + english.getWordScore("hug"));
    }
} 