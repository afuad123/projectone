package edu.guilford;

import java.util.Random;

public class ScrabbleSet {
    Random rand = new Random();
    //ATTRIBUTES
    //instantiate a list of Tile objects for the letters and the blank tile; the blank tile should be represented by a space, ' '
    private Tile[] tiles;

    //instantiate a list that provides a count of each letter in the Scrabble set
    private int[] letterCount;

    //CONSTRUCTORS
    //create a constructor that takes the language of the Scrabble set as a parameter
    public ScrabbleSet(String language) {
        //if the language is English
        if (language.equals("English")) {
            tiles = new Tile[27];
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

            letterCount = new int[100];
        }
        //if the language is something else
        else {
            System.out.println("Error: language not English");
        }
    }

    //create a constructor that takes no parameters, builds a Scrabble set with each letter having a random value for the count, subject to the following conditions:
    //The total number of tiles must be exactly 100.
    //Each letter (and the blank) must have at least one tile associated with it.
    //The points assigned to each letter should not be modified.
    public ScrabbleSet() {
        //instantiate a Tile object for each letter in the English Scrabble set
        tiles[0] = new Tile(' ', rand.nextInt(10) + 1);
        tiles[1] = new Tile('A', rand.nextInt(10) + 1);
        tiles[2] = new Tile('B', rand.nextInt(10) + 1);
        tiles[3] = new Tile('C', rand.nextInt(10) + 1);
        tiles[4] = new Tile('D', rand.nextInt(10) + 1);
        tiles[5] = new Tile('E', rand.nextInt(10) + 1);
        tiles[6] = new Tile('F', rand.nextInt(10) + 1);
        tiles[7] = new Tile('G', rand.nextInt(10) + 1);
        tiles[8] = new Tile('H', rand.nextInt(10) + 1);
        tiles[9] = new Tile('I', rand.nextInt(10) + 1);
        tiles[10] = new Tile('J', rand.nextInt(10) + 1);
        tiles[11] = new Tile('K', rand.nextInt(10) + 1);
        tiles[12] = new Tile('L', rand.nextInt(10) + 1);
        tiles[13] = new Tile('M', rand.nextInt(10) + 1);
        tiles[14] = new Tile('N', rand.nextInt(10) + 1);
        tiles[15] = new Tile('O', rand.nextInt(10) + 1);
        tiles[16] = new Tile('P', rand.nextInt(10) + 1);
        tiles[17] = new Tile('Q', rand.nextInt(10) + 1);
        tiles[18] = new Tile('R', rand.nextInt(10) + 1);
        tiles[19] = new Tile('S', rand.nextInt(10) + 1);
        tiles[20] = new Tile('T', rand.nextInt(10) + 1);
        tiles[21] = new Tile('U', rand.nextInt(10) + 1);
        tiles[22] = new Tile('V', rand.nextInt(10) + 1);
        tiles[23] = new Tile('W', rand.nextInt(10) + 1);
        tiles[24] = new Tile('X', rand.nextInt(10) + 1);
        tiles[25] = new Tile('Y', rand.nextInt(10) + 1);
        tiles[26] = new Tile('Z', rand.nextInt(10) + 1);

        //instantiate a variable to keep track of the total number of tiles
        int totalTiles = 0;

        //instantiate a variable to keep track of the number of tiles for each letter
        int letterTiles = 0;

        //instantiate a variable to keep track of the number of tiles for the blank
        int blankTiles = 0;

        //instantiate a variable to keep track of the number of tiles for each letter
        int[] letterTilesArray = new int[27];
    }

    


}
