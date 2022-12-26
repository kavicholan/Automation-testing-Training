package session2.string_operations;
//Task 8. Write a program to find the number of vowels, consonents, digits and white space characters in a string.
public class Task8 {
    public static void main(String[] args) {
        int vowels = 0, consonent = 0,digits=0,space=0;
        String string = "Fully Paid Security Lending 10 2022";
        string = string.toLowerCase();

        for(int i = 0; i < string.length(); i++) {
            if(string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i' || string.charAt(i) == 'o' || string.charAt(i) == 'u') {
                vowels++;
            }
            else if(string.charAt(i) >= 'a' && string.charAt(i)<='z') {
                consonent++;
            } else if (string.charAt(i)>='0' && string.charAt(i)<='9') {
                digits++;
            } else
                space++;
        }
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonent);
        System.out.println("Number of digits: "+ digits);
        System.out.println("Number of space: "+space);
    }
    }

