
//*************************************
//
//  Tester.java
//
//  Class to test the Scrabble helper
//
//**************************************

import java.io.PrintWriter;

public class Tester {

	public static void main(String[] args) {
		try {//Handles the FileNotFoundException
			WordLists helper = new WordLists(args[0]);
			
			//Creates strings for each list
			String[] outputLengthNList;
			String[] outputStartsWithList;
			String[] outputContainsLetterList;
			String[] outputVowelList;
			String[] outputMultiLetter;
			
			//Executes the methods for each list
			outputLengthNList = helper.lengthN(3);
			outputStartsWithList = helper.startsWith(5, 'b');
			outputContainsLetterList = helper.containsLetter(4, 'z');
			outputVowelList = helper.vowelHeavy(6, 3);
			outputMultiLetter = helper.multiLetter(3, 'e');

			//Outputs the list to file for each method
			PrintWriter output1 = new PrintWriter("lengthN.txt");
			for (int i = 0; i < outputLengthNList.length; i++) {
				output1.println(outputLengthNList[i]);
			}
			output1.close();
			
			PrintWriter output2 = new PrintWriter("startsWith.txt");
			for (int i = 0; i < outputStartsWithList.length; i++) {
				output2.println(outputStartsWithList[i]);
			}
			output2.close();
			
			PrintWriter output3 = new PrintWriter("containsLetter.txt");
			for (int i = 0; i < outputContainsLetterList.length; i++) {
				output3.println(outputContainsLetterList[i]);
			}
			output3.close();
			
			PrintWriter output4 = new PrintWriter("vowelHeavy.txt");
			for (int i = 0; i < outputVowelList.length; i++) {
				output4.println(outputVowelList[i]);
			}
			output4.close();
			
			PrintWriter output5 = new PrintWriter("multiLetter.txt");
			for (int i = 0; i < outputMultiLetter.length; i++) {
				output5.println(outputMultiLetter[i]);
			}
			output5.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
