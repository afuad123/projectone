package edu.guilford;

import java.util.Random;
/**This is a class definition file for the "Word" class which defines a word object
 * @author: A. Fuad
 * @version: 2/6/2024
 * 
 */

public class Word implements Comparable<Word> {
    //ATTRIBUTES
    
    /** 
     * String attribute that stores a word
     *  */
    private String word;
    /**
     * ScrabbleSet attribute that stores the scrabbleset used along with word
     *  */
    private ScrabbleSet scrabbleSet = new ScrabbleSet("English");

    //CONSTRUCTORS
    /** 
     * Constructor that creates the default word object
     * */
    public Word(String word, ScrabbleSet scrabbleSet) {
        this.word = word;
        this.scrabbleSet = scrabbleSet;
    }

    /**
     * A constructor that generates a  String of random length 3-12 characters and with randomly determined characters
     * */
    public Word() {
        Random random = new Random();
        int length = random.nextInt(10) + 3;
        String word = "";
        for (int i = 0; i < length; i++) {
            char c = (char) (random.nextInt(26) + 'a');
            word += c;
        }
        this.word = word;
    }

    //METHODS
    /**
     * A method that return the Scrabble score of the word using the Scrabbleset
     * */
    public int getScore() {
        return scrabbleSet.getWordScore(word);
    }
    /** 
     * A compareTo method that returns 0 if two words are identical, 
     * returns one if otherWord has a smaller score than the current Word, 
     * and returns -1 if otherWord has a larger score than the current Word.*/
    public int compareTo(Word otherWord) {
        if (this.getScore() == otherWord.getScore()) {
            //return the value of the compareTo method from String, comparing the String attributes of each Word.
            return this.word.compareTo(otherWord.word);
        } else if (this.getScore() > otherWord.getScore()) {
            return 1;
        } else {
            return -1;
        }
    }


}