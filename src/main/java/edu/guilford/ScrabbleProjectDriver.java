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

        //store words in word objects
        Word word1 = new Word("blue", english);
        Word word2 = new Word("sword", english);
        Word word3 = new Word("cracker", english);
        Word word4 = new Word("shirt", english);
        Word word5 = new Word("hug", english);
        Word word6 = new Word("edits", english);

        //Calculate point values using the standard English ScrabbleSet object for a set of at least five test words, now using word.getScore()
        System.out.println("The point value for the word blue is " + word1.getScore());
        System.out.println("The point value for the word sword is " + word2.getScore());
        System.out.println("The point value for the word cracker is " + word3.getScore());
        System.out.println("The point value for the word shirt is " + word4.getScore());
        System.out.println("The point value for the word hug is " + word5.getScore());
        System.out.println("The point value for the word edits is " + word6.getScore());

        //Compare the words using the compareTo method
        System.out.println("The word blue compared to the word sword is " + word1.compareTo(word2));
        System.out.println("The word sword compared to the word cracker is " + word2.compareTo(word3));
        System.out.println("The word cracker compared to the word shirt is " + word3.compareTo(word4));
        System.out.println("The word shirt compared to the word hug is " + word4.compareTo(word5));
        System.out.println("The word blue compared to the word edits is " + word1.compareTo(word6));

        //below is Project 1 work
    //     String filePath = "frankenstein.txt";
    //     List<String> listOfWords = new ArrayList<String>(); 


    //     try (InputStream inputStream = ScrabbleProjectDriver.class.getResourceAsStream("/" + filePath);
    //         BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
    //         String line;
    //         while ((line = br.readLine()) != null) {
    //             String[] words = line.split("\\s+");
    //             for (String word : words) {
    //                 //if (word == "dæmon"){ 
    //                 //listOfWords.remove("dæmon");   
    //                 //}
    //                 //else {
    //                 listOfWords.add(word);
    //                 //}
                    
    //             }
    //         }
    //     } catch (IOException e) {
    //         e.printStackTrace();
    //     }
    //     // Calculate the highest Scrabble score and the corresponding word
    //     String highestScoringWord = "";
    //     int highestScore = 0;
        
    //    // Calculate the shortest invalid Scrabble word
    //    String shortestInvalidWord = "";
    //    int shortestInvalidLength = 10;

    //     for (String word : listOfWords) {
    //         if (!word.contains("ê") && !word.contains("æ") && !word.contains("ô") && !word.contains("é")
    //         && !word.contains("è")){
            
    //         int score = english.getWordScore(word);
    //         if (score > highestScore) {
    //             highestScore = score;
    //             highestScoringWord = word;
    //         }
    //         else if (score == -1 && word.length() < shortestInvalidLength) {
    //             shortestInvalidWord = word;
    //             shortestInvalidLength = word.length();
    //         }
    //             }
    //         }

    //     // Print the highest scoring word
    //     System.out.println("The word with the highest Scrabble score is: " + highestScoringWord);

    //     // Print the shortest invalid Scrabble word
    //     System.out.println("The shortest invalid Scrabble word is: " + shortestInvalidWord);

    //     //RANDOMSET
    //     String hsw = "";
    //     int hs = 0;
        
    //    // Calculate the shortest invalid Scrabble word
    //    String siw = "";
    //    int sil = 10;

    //     for (String word : listOfWords) {
    //         if (!word.contains("ê") && !word.contains("æ") && !word.contains("ô") && !word.contains("é")
    //         && !word.contains("è")){
            
    //         int score = random.getRandomWordScore(word);
    //         if (score > hs) {
    //             hs = score;
    //             hsw = word;
    //         }
    //         else if (score == -1 && word.length() < sil) {
    //             siw = word;
    //             sil = word.length();
    //         }
    //             }
    //         }

    //     // Print the highest scoring word
    //     System.out.println("The word with the highest Scrabble score is: " + hsw);

    //     // Print the shortest invalid Scrabble word
    //     System.out.println("The shortest invalid Scrabble word is: " + siw);

       
   }       
               
}
 