package edu.guilford;

public class ScrabbleSet {
    //ATTRIBUTES
    //instantiate a list of Tile objects for the letters and the blank tile; the blank tile should be represented by a space, ' '
    private Tile[] tiles = new Tile[27];

    //instantiate a list that provides a count of each letter in the Scrabble set
    private int[] letterCount = new int[27];

    //CONSTRUCTORS
    //create a constructor that takes the language of the Scrabble set as a parameter
    public ScrabbleSet(String language) {
        //if the language is English
        if (language.equals("English")) {
            //instantiate a Tile object for each letter in the English Scrabble set
            tiles[0] = new Tile(' ', 0);
            tiles[1] = new Tile('A', 1);
            tiles[2] = new Tile('B', 3);
            tiles[3] = new Tile('C', 3);
            tiles[4] = new Tile('D', 2);
            tiles[5] = new Tile('E', 1);
            tiles[6] = new Tile('F', 4);
            tiles[7] = new Tile('G', 2);
            tiles[8] = new Tile('H', 4);
            tiles[9] = new Tile('I', 1);
            tiles[10] = new Tile('J', 8);
            tiles[11] = new Tile('K', 5);
            tiles[12] = new Tile('L', 1);
            tiles[13] = new Tile('M', 3);
            tiles[14] = new Tile('N', 1);
            tiles[15] = new Tile('O', 1);
            tiles[16] = new Tile('P', 3);
            tiles[17] = new Tile('Q', 10);
            tiles[18] = new Tile('R', 1);
            tiles[19] = new Tile('S', 1);
            tiles[20] = new Tile('T', 1);
            tiles[21] = new Tile('U', 1);
            tiles[22] = new Tile('V', 4);
            tiles[23] = new Tile('W', 4);
            tiles[24] = new Tile('X', 8);
            tiles[25] = new Tile('Y', 4);
            tiles[26] = new Tile('Z', 10);
        }
        //if the language is Spanish
        else if (language.equals("Spanish")) {
            //instantiate a Tile object for each letter in the Spanish Scrabble set
            tiles[0] = new Tile(' ', 0);
            tiles[1] = new Tile('A', 1);
            tiles[2] = new Tile('B', 3);
        }
    }

}
