package edu.guilford;

import java.util.Random;

public class Word implements Comparable<Word> {
    //ATTRIBUTES
    //string that contains the word
    private String word;
    //scrabble set that evalutes the score of the word
    private ScrabbleSet scrabbleSet = new ScrabbleSet("English");

    //CONSTRUCTORS
    //have one constructor that takes String and ScrabbleSet parameters 
    public Word(String word, ScrabbleSet scrabbleSet) {
        this.word = word;
        this.scrabbleSet = scrabbleSet;
    }

    //add a constructor that generates a  String of random length 3-12 characters and with randomly determined characters
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

    //Include a word list (this listLinks to an external site. looks pretty comprehensive) in your project and select a random word 
    //from the list, also ensuring that the word is at least two letters in length.
    //is this a separate constructor?

    //METHODS
    //Add one method that return the Scrabble score of the word using the Scrabbleset
    public int getScore() {
        return scrabbleSet.getWordScore(word);
    }
    //create a compareTo method with the identifier public int compareTo(Word otherWord);
    //it returns 0 if two words are identical, returns one if otherWord has a smaller score than the current Word, and returns -1 if otherWord has a larger score than the current Word.
    public int compareTo(Word otherWord) {
        if (this.getScore() == otherWord.getScore()) {
            return 0;
        } else if (this.getScore() > otherWord.getScore()) {
            return 1;
        } else {
            return -1;
        }
    }//If the scores are the same, but the words are not identical, then return the value of the compareTo method from String, comparing the String attributes of each Word.
    //what does this mean?


}