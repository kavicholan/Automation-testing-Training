package session2.string_operations;

import java.util.HashMap;

//Task 10. Input a string of alphabets. Find out the number of occurrence of all alphabets in that string.
// Find out the alphabet with maximum occurrence.
public class Task10 {
    public static void main(String[] args) {
String string ="Kavicholan";
        char letter = 'a';
        int count = 0;

        for ( int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == letter)
                count++;
        }
        System.out.println("Occurrences of "+letter+" are " +count);
    }
}
 