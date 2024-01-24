package edu.guilford;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
//import java.io.FileReader;

public class ScrabbleProjectDriver {
    public static void main(String[] args) throws IOException {
        //Instantiate two ScrabbleSet objects, one for standard English and one using the random constructor.
        ScrabbleSet english = new ScrabbleSet("English");
        ScrabbleSet random = new ScrabbleSet();

        //Calculate point values using the standard English ScrabbleSet object for a set of at least five test words: blue, lord, bag, shirt, hug
        System.out.println("The point value for the word blue is " + english.getWordScore("blue"));
        System.out.println("The point value for the word sword is " + english.getWordScore("sword"));
        System.out.println("The point value for the word cracker is " + english.getWordScore("cracker"));
        System.out.println("The point value for the word shirt is " + english.getWordScore("shirt"));
        System.out.println("The point value for the word hug is " + english.getWordScore("hug"));

        String filePath = "frankenstein.txt";
        List<String> listOfWords = new ArrayList<String>(); 


        try (InputStream inputStream = ScrabbleProjectDriver.class.getResourceAsStream("/" + filePath);
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    listOfWords.add(word);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
                
        // Calculate the highest Scrabble score and the corresponding word
        String highestScoringWord = "";
        int highestScore = 0;
        
       // Calculate the shortest invalid Scrabble word
       String shortestInvalidWord = null;
       int shortestInvalidLength = Integer.MAX_VALUE;

       for (String word : listOfWords) {
           int score = english.getWordScore(word);
           if (score > highestScore) {
               highestScore = score;
               highestScoringWord = word;
           }
           if (english.getWordScore(word) == 00 && word.length() < shortestInvalidLength) {
               shortestInvalidWord = word;
               shortestInvalidLength = word.length();
           }
       }

       // Print the highest scoring word
       System.out.println("The word with the highest Scrabble score is: " + highestScoringWord);

       // Print the shortest invalid Scrabble word
       System.out.println("The shortest invalid Scrabble word is: " + shortestInvalidWord);

       
   }       
               
}
 