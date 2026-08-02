/*
 * Pattern 13: Mixed-Case Right-Angled Triangle
 * 
 * A
 * b b
 * C C C
 * d d d d
 * E E E E E
 * 
 */

import java.util.Scanner;

public class Pattern13_MixedCaseAlphaRamp {
    public static void main(String []Args){
    System.out.println("Enter the no count ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println("Your pattern is ");
    
    for( int i =1 ;i<=n;i++){
        for(int j = 1 ; j <= i ; j++){
         //   System.out.print((i%2 == 0) ? (char)(i+96) + " " : (char)(i+64) + " ") ;
           //yu can do it using if-else 
            if(i%2==0)
                System.out.print((char)(i+96)+" ");
            else
                System.out.print((char)(i+64)+" ");
        }
        System.out.println();
    }
    
    sc.close();
    }
}
