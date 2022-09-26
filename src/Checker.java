import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Checker {
	public static void main(String args[]) throws IOException {
		String exerciseNumber = "001"; 
		String  problemFilename  = "./src/Exercise" + exerciseNumber + ".java";
		String  solutionFileName = "./src/Exercise" + exerciseNumber + "Solution.txt";
		int lineNumberCounter = 1;
		
		Scanner problemScanner  = new Scanner(new BufferedReader(new FileReader(problemFilename)));
		Scanner solutionScanner  = new Scanner(new BufferedReader(new FileReader(solutionFileName)));

		// skip open comments
		while(solutionScanner.hasNext()) {
			System.out.println(lineNumberCounter + ": Line Number: " + lineNumberCounter);
			if(!problemScanner.hasNext()) {
				System.out.println("Uh Oh!");
				System.out.println("Uh Oh!");
				System.out.println("Uh Oh!");
				System.out.println("Status: You're missing a line!!!");
				System.out.println(lineNumberCounter + ": Line Number " + lineNumberCounter + " should be:\t\t\"" + solutionScanner.nextLine() +"\"");
				throw new UnsupportedOperationException("Status: WRONG ANSWER!! Wrong Number of lines!!!");
			}
			String whatEliasWrote = problemScanner.nextLine();
			String correctAnswer = solutionScanner.nextLine();
			System.out.println(lineNumberCounter + ": What Elias wrote:\t\t\"" + whatEliasWrote + "\"");
			System.out.println(lineNumberCounter + ": What the correct answer is:\t\"" + correctAnswer + "\"");
			if(whatEliasWrote.contains(correctAnswer)) {
				System.out.println(lineNumberCounter + ": Status: Correct Answer");
			} // end if
			else {
				System.out.println("Uh Oh!");
				System.out.println("Uh Oh!");
				System.out.println("Uh Oh!");
				System.out.println("Status: WRONG ANSWER");
				throw new UnsupportedOperationException("Status: WRONG ANSWER");
			} // end else
			
			lineNumberCounter++;
		} // end while
		
		System.out.println("HURRAY EVERYTHING IS CORRECT");
		System.out.println("HURRAY EVERYTHING IS CORRECT");
		System.out.println("HURRAY EVERYTHING IS CORRECT");
		System.out.println("HURRAY EVERYTHING IS CORRECT");
		System.out.println("HURRAY EVERYTHING IS CORRECT");
		System.out.println("HURRAY EVERYTHING IS CORRECT");
		System.out.println("HURRAY EVERYTHING IS CORRECT");
		System.out.println("HURRAY EVERYTHING IS CORRECT");
	} // end main method
} // end class
