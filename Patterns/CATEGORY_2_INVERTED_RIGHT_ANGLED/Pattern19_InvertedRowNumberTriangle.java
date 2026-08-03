/*
 * Pattern 19: Inverted Row Number Triangle
 * 
 * 5 5 5 5 5
 * 4 4 4 4
 * 3 3 3
 * 2 2
 * 1
 * 
 */

import java.util.Scanner;

public class Pattern19_InvertedRowNumberTriangle {
    public static void main(String []Args){
    System.out.println("Enter the no count ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
     System.out.println("Your pattern is ");
    // for (int i = 1; i<= n ; i++){
    //     for (int j = 1; j<= n-i+1 ; j++){
    //         System.out.print(n-i+1 + " ");
    //     }
    //     System.out.println();
    // }

    //Another way - playwith the oputer loop
    for (int i = n; i >= 1 ; i--){
        for (int j = 1; j<= i ; j++){
            System.out.print(i+" ");
        }
        System.out.println();
    }
     sc.close();
}
}
