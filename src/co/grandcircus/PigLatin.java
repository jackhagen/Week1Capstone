//@author Jack Hagen

package co.grandcircus;

import java.util.Scanner;

public class PigLatin {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		String userChar;
		System.out.println("Welcome to the Pig Latin Translator!");
		System.out.println();

		do {
			System.out.print("Enter a line to be translated: ");
			final String userInput = scnr.nextLine();
			String[] word = userInput.split(" ");
			String output = "";

			for (int i = 0; i < word.length; i++) {
				String pigLatinWord = translateWord(word[i]);
				output += pigLatinWord + " ";
			}

			System.out.println(output);
			System.out.println("Translate another line? (y/n)");
			userChar = scnr.nextLine();
			System.out.println();

		} while (userChar.equalsIgnoreCase("y") || userChar.equalsIgnoreCase("Yes"));

		while (userChar.equalsIgnoreCase("n") || userChar.equalsIgnoreCase("No")) {
			System.out.println("Anksthay orfay usingyay ethay igPay atinLay anslatorTray!");
			break;
		}
		scnr.close();
	}

	public static String translateWord(String word) {
		String wordToTranslate = word;
		int pos = -1;
		char ch;

		for (int i = 0; i < wordToTranslate.length(); i++) {
			ch = wordToTranslate.charAt(i);

			if (isVowel(ch)) {
				pos = i;
				break;
			}
		}

		if (pos == 0) {
			return wordToTranslate + "yay";
		} else {
			String a = wordToTranslate.substring(pos);
			String b = wordToTranslate.substring(0, pos);
			return a + b + "ay";
		}
	}

	public static Boolean isVowel(char ch) {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			return true;
		}
		return false;
	}
}