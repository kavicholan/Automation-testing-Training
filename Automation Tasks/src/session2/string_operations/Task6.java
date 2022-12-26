package session2.string_operations;
//Task 6. Write a program to find the first and the last occurence of the letter 'o' and character ',' in "Hello, World".
public class Task6 {
    public static void main(String[] args) {
        String letter = "Hello, World";
        System.out.println(letter.indexOf("o", 1) +" first occurence of the letter 'o' ");
        System.out.println(letter.lastIndexOf("o")+" last occurence of the letter 'o' ");
    }

    }
