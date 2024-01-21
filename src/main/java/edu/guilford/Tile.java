package edu.guilford;

public class Tile {
    //ATTRIBUTES
    //make an attribute for a single character for the letter on the tile
    private char letter;
    //make an attribute for an integer for the point value for the letter
    private int pointValue;

    //GETTERS AND SETTERS
    //make a getter for the letter attribute.
    public char getLetter() {
        return letter;
    }
    //make a setter for the letter attribute.
    public void setLetter(char letter) {
        this.letter = letter;
    }
    //make a getter for the pointValue attribute.
    public int getPointValue() {
        return pointValue;
    }
    //make a setter for the pointValue attribute.
    public void setPointValue(int pointValue) {
        this.pointValue = pointValue;
    }

    //CONSTRUCTORS
    //make a constructor that takes a letter and a point value as parameters
    public Tile(char letter, int pointValue) {
        this.letter = letter;
        this.pointValue = pointValue;
    }

    //METHODS
    //add a toString method that prints out the attributes of the Tile object
    public String toString() {
        return "The letter on the tile is: " + letter + "and the value of the tile is: " + pointValue;
    }


}
