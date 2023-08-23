package no._1_basics_of_java;

import java.util.Scanner;

        /* Que ---> Write a program to calculate percentage of a given student in CBSC board exam.
           His marks from 5 subject must take as input from the keyboard (marks are out of 100) */


public class _06_exerciseNo1_boardResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your subject marks below");
        int hindi, socialScience, mathematics, geography, scienceAndTechnology;

        // taking marks of each subject --->
        System.out.print("hindi : ");
        hindi = sc.nextInt();

        System.out.print("socialScience :");
        socialScience = sc.nextInt();

        System.out.print("mathematics :");
        mathematics = sc.nextInt();

        System.out.print("geography :");
        geography = sc.nextInt();

        System.out.print("science and technology :");
        scienceAndTechnology = sc.nextInt();

        float result  = (hindi + socialScience + mathematics + geography + scienceAndTechnology)/5f ;

        System.out.println("your  percentage result is : " + result + "%");
}

}
