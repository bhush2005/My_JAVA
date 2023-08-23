package no._2_typesofOPerators_andExpressions;

public class _09_operatorPresidence {
    public static void main(String[] args) {

        /* highest presidence goes to * and /. Then they are get solved by left to right
           presidence order -->
           1) -, / --> L to R
           2) -, + --> L to R
           3) ++, == --> R to L
         */

//        int a = 60/5-34*2;
//        /* --> 60/5-34*2
//              =10-34*2
//              =10-68
//          ans =-56
//         */
//        System.out.println(a);


// QUICK quiz
        int b = 1;
        int c = 4;
        int a = 5;
        int  ans = b*b-4*a*c/2*a;
        /* b*b-4*a*c/2*a
          =1-4*5*4/2*5
          =1-80/2*5
          =1-40*5
          =1-200
      ans =-199
         */
        System.out.println(ans);


    }

}
