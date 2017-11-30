
//*************************************
//
//  WordLists.java
//
//  Class to aid with Scrabble
//
//**************************************

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class WordLists {

	private ArrayList<String> dictionary;
	
	//Lets the tester class handle the exception so that the program
	//does not continue running when it encounters problems
	public WordLists(String fileName) throws FileNotFoundException {
			dictionary = new ArrayList<String>();
			File inFile = new File(fileName);
			Scanner input = new Scanner(inFile);
			while (input.hasNext()) {
				dictionary.add(input.next());
			}
	}

	public String[] lengthN(int n) {
		//Create an ArrayList first as it is more flexible
		ArrayList<String> lengthNList = new ArrayList<String>();
		
		for (int i = 0; i < dictionary.size(); i++) {
			String word = dictionary.get(i);
			if (word.length() == n) {
				lengthNList.add(word);
			}
		}
		
		//Converts the ArrayList to an array to be exported to the Tester
		int lengthOfList = lengthNList.size();
		String[] export = new String[lengthOfList];
		for (int j = 0; j < export.length; j++) {
			export[j] = lengthNList.get(j);
		}
		
		//Handles errors when the list is empty
		if (export.length == 0) {
			System.out.println("Please re-check your input for the lengthN method.");
			System.out.println("Common errors for length n include entering 0 or a negative number ");
			System.out.println("or entering a number that is too big.");
			System.out.println();
		}
		
		return export;
	}

	public String[] startsWith(int n, char firstLetter) {
		String[] lengthNList = this.lengthN(n);
		ArrayList<String> startsWithList = new ArrayList<String>();
		
		for (int i = 0; i < lengthNList.length; i++) {
			char ch = lengthNList[i].charAt(0);
			if (ch == firstLetter) {
				startsWithList.add(lengthNList[i]);
			}
		}
		
		int lengthOfList = startsWithList.size();
		String[] export = new String[lengthOfList];
		for (int j = 0; j < export.length; j++) {
			export[j] = startsWithList.get(j);
		}
		
		if (export.length == 0) {
			System.out.println("Please re-check your input for the startsWith method.");
			System.out.println("Common errors for length n include entering 0 or a negative number ");
			System.out.println("or entering a number that is too big.");
			System.out.println("Another common error is entering a capitalized letter ");
			System.out.println("or a character that is not an alphabet.");
			System.out.println();
		}
		
		return export;

	}

	public String[] containsLetter(int n, char included) {
		String[] lengthNList = this.lengthN(n);
		ArrayList<String> containsLetterList = new ArrayList<String>();
		
		for (int i = 0; i < lengthNList.length; i++) {
			String word = lengthNList[i];
			boolean toBeIncluded = false;
			if (word.charAt(0) == included) {

			} else {
				for (int j = 1; j < word.length(); j++) {
					if (word.charAt(j) == included) {
						toBeIncluded = true;
						//To prevent adding a word to the list multiple times
					}
				}
			}
			if(toBeIncluded){
				containsLetterList.add(word);
			}
		}
		
		int lengthOfList = containsLetterList.size();
		String[] export = new String[lengthOfList];
		for (int k = 0; k < export.length; k++) {
			export[k] = containsLetterList.get(k);
		}
		
		if (export.length == 0) {
			System.out.println("Please re-check your input for the containsLetter method.");
			System.out.println("Common errors for length n include entering 0 or a negative number ");
			System.out.println("or entering a number that is too big.");
			System.out.println("Another common error is entering a capitalized letter ");
			System.out.println("or a character that is not an alphabet.");
			System.out.println();
		}
		
		return export;

	}

	public String[] vowelHeavy(int n, int m) {
		String[] lengthNList = this.lengthN(n);
		ArrayList<String> nVowelsList = new ArrayList<String>();
		
		for (int i = 0; i < lengthNList.length; i++) {
			int vowelCounter = 0;
			String word = lengthNList[i];
			for (int j = 0; j < word.length(); j++) {
				char currentChar = word.charAt(j);
				if (currentChar == 'a' || currentChar == 'e'
						|| currentChar == 'i' || currentChar == 'o'
						|| currentChar == 'u') {
					vowelCounter++;
				}
			}
			if (vowelCounter >= m) {
				nVowelsList.add(word);
			}
		}
		
		int lengthOfList = nVowelsList.size();
		String[] export = new String[lengthOfList];
		for (int k = 0; k < export.length; k++) {
			export[k] = nVowelsList.get(k);
		}
		
		if (export.length == 0) {
			System.out.println("Please re-check your input for the vowelHeavy method.");
			System.out.println("Common errors for length n include entering 0 or a negative number ");
			System.out.println("or entering a number that is too big.");
			System.out.println("Another common error is requesting too many vowel ");
			System.out.println("or requesting more vowels than there are characters in the word");
			System.out.println();
		}
		
		return export;

	}

	public String[] multiLetter(int m, char included) {
		ArrayList<String> occuranceList = new ArrayList<String>();
		
		for (int i = 0; i < dictionary.size(); i++) {
			String word = dictionary.get(i);
			int occuranceCounter = 0;
			for (int j = 0; j < word.length(); j++) {
				char currentChar = word.charAt(j);
				if (currentChar == included) {
					occuranceCounter++;
				}
			}
			if (occuranceCounter >= m) {
				occuranceList.add(word);
			}
		}
		
		int lengthOfList = occuranceList.size();
		String[] export = new String[lengthOfList];
		for (int k = 0; k < export.length; k++) {
			export[k] = occuranceList.get(k);
		}
		
		if (export.length == 0) {
			System.out.println("Please re-check your input for the multiLetter method.");
			System.out.println("Common errors including entering a big number for length m ");
			System.out.println("or entering a character that is not an alphabet.");
			System.out.println();
		}
		return export;

	}

} 
