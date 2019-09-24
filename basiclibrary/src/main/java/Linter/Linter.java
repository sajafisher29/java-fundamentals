package Linter;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringJoiner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Linter {

    public static void main(String[] args) {
        File fileForLinter = new File(String.format("main/resources/%s", args[0]))
        javascriptLinter(fileForLinter);
    }

// Write a method that reads a JavaScript file with a given Path, and generates an error message whenever it finds a line that doesn’t end in a semi-colon.
// Read through the file line by line. Create a string that contains a message such as "Line 3: Missing semicolon." if a line is missing a semicolon.
// Don’t show an error if the line is empty.
// Don’t show an error if the line ends with an opening curly brace {
// Don’t show an error if the line ends with an closing curly brace }
// Don’t show an error if the line contains if or else
// Call that method in your main method on the file gates.js, and print out the resulting error message.

}
