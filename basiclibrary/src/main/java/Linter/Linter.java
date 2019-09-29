package Linter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Linter {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("src/main/resources/gates.js"));
            System.out.println(jsLinter(scanner));
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }

// Write a method that reads a JavaScript file with a given Path, and generates an error message whenever it finds a line that doesn’t end in a semi-colon.
// Read through the file line by line. Create a string that contains a message such as "Line 3: Missing semicolon." if a line is missing a semicolon.
// Don’t show an error if the line is empty.
// Don’t show an error if the line ends with an opening curly brace {
// Don’t show an error if the line ends with an closing curly brace }
// Don’t show an error if the line contains if or else
// Call that method in your main method on the file gates.js, and print out the resulting error message.

    static String jsLinter(Scanner scanner) {
        int lineCount = 0;
        String resultingError = "";

        while (scanner.hasNext()) {
            lineCount++;

            String line = scanner.nextLine();

            int lineLength = line.length();

            if (lineLength > 0) {
                char lastCharacter = line.charAt(lineLength - 1);
                if ((lastCharacter != '}') && (lastCharacter != '{')) {
                    boolean containsCurlyIfElse = false;
                    Scanner word = new Scanner(line);
                    while (word.hasNext()) {
                        String stepWord = word.next();
                        if (stepWord.equals("if") || stepWord.equals("else")) {
                            containsCurlyIfElse = true;
                        }
                    }
                    if (!containsCurlyIfElse && (lastCharacter != ';')) {
                        System.out.println(String.format("Line %d does not end with a semicolon.", lineCount));
                        resultingError += String.format("Line %d does not end with a semicolon.\n", lineCount);
                    }
                }
            }
        }
        return resultingError;
    }
}
