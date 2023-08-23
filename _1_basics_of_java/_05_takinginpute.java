package no._1_basics_of_java;

import java.util.Scanner;

public class _05_takinginpute {
    public static void main(String[] args) {

        // Que --->> take age of a user as an input and display it

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");


        int age = sc.nextInt();

        System.out.println("you are " + age + " years old");


        // taking input as a string

//        System.out.print("\n enter your full name : ");
//
//        String str = sc.nextLine();
//        System.out.println(str);





    }
}
