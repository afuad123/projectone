package edu.guilford;
/** This is a class definition file for the "Tile" class which defines a Tile object.
 * @author A. Fuad
 * @version 2/7/24
 */

public class Tile {
    //ATTRIBUTES
    /** 
     * An attribute for a single character for the letter on the tile*/
    private char letter;
    /**
     * An attribute for an integer for the point value for the letter*/
    private int pointValue;

    //GETTERS AND SETTERS
    /**Makes a getter for the letter attribute.
     * @return the letter on the tile
    */
    public char getLetter() {
        return letter;
    }
    /**Makes a setter for the letter attribute.
     * @param letter the letter to set
    */
    public void setLetter(char letter) {
        this.letter = letter;
    }
    /**Makes a getter for the pointValue attribute.
     * @return the point value of the letter
    */
    public int getPointValue() {
        return pointValue;
    }
    /**Makes a setter for the pointValue attribute.
     * @param pointValue the point value to set the tile to
    */
    public void setPointValue(int pointValue) {
        this.pointValue = pointValue;
    }

    //CONSTRUCTORS
    /**Makes a constructor that takes a letter and a point value as parameters
     * @param letter the letter on the tile
     * @param pointValue the point value of the letter
    */
    public Tile(char letter, int pointValue) {
        this.letter = letter;
        this.pointValue = pointValue;
    }

    //METHODS
    /**Makes a method that returns a string representation of the tile
     * @return a string representation of the tile
    */
    @Override
    public String toString() {
        return "Tile [letter=" + letter + ", pointValue=" + pointValue + "]";
    }

    
    


}
