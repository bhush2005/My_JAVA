package no._1_basics_of_java;

import java.util.Scanner;

public class _07_practiceSet1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


// Que1 ---> take the input of three numbers from the user and by adding them show the result:
        // int num1, num2, num3, sum;
        // System.out.println("enter the three numbers :");

        // System.out.print("num1 :");
        // num1 = sc.nextInt();
        // System.out.print("num2 :");
        // num2 = sc.nextInt();
        // System.out.print("num3 :");
        // num3 = sc.nextInt();

        // sum = num1 + num2 + num3 ;
        // System.out.println("the sum of three numbers is : " + sum );


// Que2 ---> write a java program to calculate the CGPA d three subject

       float sub1, sub2, sub3;

       sub1 = 65;
       sub2 = 68;
       sub3 = 45;

       float CGPA = (sub1+sub2+sub3)/3;
       System.out.println("CGPA is :" + CGPA);


/* Que3 ---> Write a java program which ask the user to enter his her name and returns them
   "hello <name> have a good day "  */

//        System.out.println("Enter your name :");
//        String name = sc.nextLine();
//
//        System.out.println("Hello "+ name + ", have a good day!");



// Que4 ---> write a java program to convert kilometers to miles
//        System.out.print("enter the value in kilometers :");
//
//        float km = sc.nextFloat();
//        System.out.println("the value in miles is : " + km *0.621371 );

// Que5 ---> write a java program to check the number entered by he user is integer or not

//        System.out.println("enter a number : ");
//        System.out.println(sc.hasNextInt());
    }

}
