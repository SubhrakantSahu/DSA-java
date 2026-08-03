/*
 * Pattern 05: Inverted Right-Angled Triangle
 * 
 * * * * * *
 * * * * *
 * * * *
 * * *
 * *
 * 
 */

import java.util.Scanner;

public class Pattern05_InvertedRightTriangle {
     public static void main(String []Args){
    System.out.println("Enter the no count ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println("Your pattern is ");
    for (int i = 1; i<= n ; i++){
        for (int j = 1; j<= n+1-i ; j++){
            System.out.print("*"+" ");
        }
        System.out.println();
    }
    // Another way of doing it is starting i from the reverse side - for the outer loop 
    // for (int i = n; i>=1 ; i--){
    //     for (int j = 1; j<= i ; j++){
    //         System.out.print("*"+" ");
    //     }
    //     System.out.println();
    // }
    sc.close();
}
}
