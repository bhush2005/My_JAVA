package no._2_typesofOPerators_andExpressions;

public class _12_PracticeSet2 {
    public static void main(String[] args) {

/* Que1 --> what will be the result of  float a = 7/4*9/2 :
        ams will be :-
            ans = 7 / 4 * 9 / 2
                = 1.75 * 9 / 2
                = 15.75 / 2
                = 7.875
*/
        float a = 7/4f*9/2;
        System.out.println("question1= "+ a);

// Que2 --> Write a java program to encrypt a grade by adding 8 to it. decrypt it to show the correct grade

        // Encrypting the grade
        char grade = 'B';
        grade = (char) (grade + 8);
        System.out.println(grade);

        //decrypting the grade

        grade = (char) (grade - 8);
        System.out.println(grade);

// Que3 -->



    }
}
