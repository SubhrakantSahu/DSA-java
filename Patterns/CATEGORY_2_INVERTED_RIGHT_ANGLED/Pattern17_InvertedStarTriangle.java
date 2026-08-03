/*
 * Pattern 17: Inverted Right-Angled Star Triangle
 * 
 
 * * * * *
 * * * *
 * * *
 * *
 * *
 * 
 
 */

import java.util.Scanner;

public class Pattern17_InvertedStarTriangle {

    
public static void main(String []Args){
    System.out.println("Enter the no count ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
     System.out.println("Your pattern is ");
    for (int i = 1; i<= n ; i++){
        for (int j = 1; j<= n-i+1 ; j++){
            System.out.print("* ");
        }
        System.out.println();
    }

    //Another way - playwith the oputer loop
    // for (int i = n; i >= 1 ; i--){
    //     for (int j = 1; j<= i ; j++){
    //         System.out.print("* ");
    //     }
    //     System.out.println();
    // }
    sc.close();
}
}