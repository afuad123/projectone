package edu.guilford;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
// import java.io.InputStream;
// import java.io.InputStreamReader;
// import java.util.ArrayList;
// import java.util.List;
// import java.io.BufferedReader;
//import java.io.FileReader;
import java.util.Scanner;

/**This is a driver program for the Scrabble Project that tests the Word, Tile, and ScrabbleSet classes
 * @author: A. Fuad
 * @version: 2/6/2024
 * @see Word
 * @see ScrabbleSet
 * @see Tile
 */

public class ScrabbleProjectDriver {
    public static void main(String[] args) throws IOException {
        //Instantiate two ScrabbleSet objects, one for standard English and one using the random constructor.
        ScrabbleSet english = new ScrabbleSet("English");
        //ScrabbleSet random = new ScrabbleSet();

        //store words in word objects
        Word word1 = new Word("blue", english);
        Word word2 = new Word("sword", english);
        Word word3 = new Word("cracker", english);
        Word word4 = new Word("shirt", english);
        Word word5 = new Word("hug", english);
        Word word6 = new Word("edits", english);

        //Calculate point values using the standard English ScrabbleSet object for a set of at least five test words, now using word.getScore()
        // System.out.println("The point value for the word blue is " + word1.getScore());
        // System.out.println("The point value for the word sword is " + word2.getScore());
        // System.out.println("The point value for the word cracker is " + word3.getScore());
        // System.out.println("The point value for the word shirt is " + word4.getScore());
        // System.out.println("The point value for the word hug is " + word5.getScore());
        // System.out.println("The point value for the word edits is " + word6.getScore());

        // //Compare the words using the compareTo method
        // System.out.println("The word blue compared to the word sword is " + word1.compareTo(word2));
        // System.out.println("The word sword compared to the word cracker is " + word2.compareTo(word3));
        // System.out.println("The word cracker compared to the word shirt is " + word3.compareTo(word4));
        // System.out.println("The word shirt compared to the word hug is " + word4.compareTo(word5));
        // System.out.println("The word blue compared to the word edits is " + word1.compareTo(word6));

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

    //start of project 3 work
    //generate an array of random objects, and size of the array is determined by user input
    int size = 0;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the size of the array: ");
    size = scanner.nextInt();
    scanner.close();
    //use the size to create an array of random words using the random Word() constructor
    Word[] randomWords = new Word[size];
    for (int i = 0; i < size; i++)
    {
        Word randomWord = new Word();
        //System.out.println(randomWord);
        randomWords[i] = randomWord;
    }

    //print out the array
    System.out.println("Original array: " + Arrays.toString(randomWords));
    System.out.println(" ");
    //shuffle the array using swap
    for (int i = 0; i < randomWords.length; i++) {
        int randomIndex = (int) (Math.random() * randomWords.length);
        swap(randomWords, i, randomIndex);
    }
    //print out the shuffled array
    System.out.println("Shuffled array: " + Arrays.toString(randomWords));
    System.out.println(" ");
    //implement the selectionSort method on this array
    long startTime = System.nanoTime();
    selectionSort(randomWords);
    long endTime = System.nanoTime();
    long duration = (endTime - startTime);
    //print out the sorted array
    System.out.println("Sorted array using Selection Sort: " + Arrays.toString(randomWords));
    System.out.println("Selection Sort took " + duration/1.e+9 + " seconds");
    System.out.println(" ");

    //shuffle the array again
    for (int i = 0; i < randomWords.length; i++) {
        int randomIndex = (int) (Math.random() * randomWords.length);
        swap(randomWords, i, randomIndex);
    }
    //print out the shuffled array
    System.out.println("Reshuffled-array: " + Arrays.toString(randomWords));
    System.out.println(" ");
    //implement the quickSort method on this array
    startTime = System.nanoTime();
    quickSort(randomWords);
    endTime = System.nanoTime();
    duration = (endTime - startTime);
    //print out the sorted array
    System.out.println("Sorted array using Quick Sort: " + Arrays.toString(randomWords));
    System.out.println("Quick Sort took " + duration/1.e+9 + " seconds");
    System.out.println(" ");
    
   


    

       
   } 

   //methods that will be used in this driver program: swap, selectionSort, partition, quickSort
    public static void swap (Object[] array, int i, int j) {
        Object temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }      
   //create a selectionSort method to sort the random word objects by score from least to greatest
    public static void selectionSort(Word[] arr) {
     for (int i = 0; i < arr.length - 1; i++) {
          int minIndex = i;
          for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].getScore() < arr[minIndex].getScore()) {
                 minIndex = j;
                }
          }
          Word temp = arr[minIndex];
          arr[minIndex] = arr[i];
          arr[i] = temp;
     }
               
    }
    //partition method for quicksort
    public static int partition(Word[] array, int low, int high) {
        //low is start of array, high is end, find pivot (middle)
        int pivot = (low + high) / 2;
        swap(array,pivot,high);
        Word pivotValue = array[high]; //value of the pivot (the word)
        //creating left and right pointers
        int left = low;
        int right = high - 1;

        //while the pointers have not crossed paths
        while (left <= right) {
            while (left <= right && array[left].compareTo(pivotValue) <= 0) {
                left++;
                //results in the first object greater than the pivot
            }
            while (left <= right && array[right].compareTo(pivotValue) > 0) {
                right--;
                //results in the first object less than the pivot
            }
            //swap the two objects under condition that the objects still haven't crossed paths
            if (left < right) {
                swap(array,left,right);
                left++;
                right--;
            }
        }
        //after the pointers cross paths, swap the two objects
        swap(array,high,left); //now the pivot is in the correct place
        return left; //report the final place of the pivot
    }
    //quicksort method
    public static void quickSort(Word[] array, int low, int high) {
        if (low < high) {
            int pivot = partition(array,low,high);
            quickSort(array,low,pivot-1);
            quickSort(array,pivot+1,high);
        }
    }
    public static void quickSort(Word[] array) {
        quickSort(array, 0, array.length - 1);
    }
}
 