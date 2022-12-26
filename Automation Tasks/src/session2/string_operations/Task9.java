package session2.string_operations;
//Task 9. Write a program to delete all consonents from the string "Hello, have a good day".
public class Task9 {
    public static void main(String[] args) {
        String string ="Hello, have a good day";
        string = string.toLowerCase();
        String vowels = "([aeiou])";
        String result = string.replaceAll(vowels, "");
        System.out.println("Result: "+result);
    }
}
