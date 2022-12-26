package session2.class_object;
//Write a Java Program
//a) A class should consist of five global variables with value
//b) All variables should be printed in the main method through object creation.
public class Task1 {
    String name="Kavicholan.S";
    int id =453;
    String company ="Ionixx";
    String location ="chennai";
    Long pincode=6000029L;

    public static void main(String[] args) {
Task1 kc =new Task1();
 kc.name= kc.name;
 kc.id= kc.id;
 kc.company= kc.company;
 kc.location=kc.location;
 kc.pincode= kc.pincode;

        System.out.println(kc.name);
        System.out.println(kc.id);
        System.out.println(kc.company);
        System.out.println(kc.location);
        System.out.println(kc.pincode);

    }
    }
