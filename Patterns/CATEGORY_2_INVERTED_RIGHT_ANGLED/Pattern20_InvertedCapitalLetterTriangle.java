/*
 * Pattern 20: Inverted Capital Letter Triangle
 * 
 * A B C D E
 * A B C D
 * A B C
 * A B
 * A
 * 
 */

import java.util.Scanner;

public class Pattern20_InvertedCapitalLetterTriangle {
    public static void main(String []Args){
    System.out.println("Enter the no count ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
     System.out.println("Your pattern is ");
    for (int i = 1; i<= n ; i++){
        for (int j = 1; j<= n-i+1 ; j++){
            System.out.print((char)(j+64) + " ");
        }
        System.out.println();
    }

    //Another way - playwith the oputer loop
    // for (int i = n; i >= 1 ; i--){
    //     for (int j = 1; j<= i ; j++){
    //         System.out.print((char)(j+64)+" ");
    //     }
    //     System.out.println();
    // }
     sc.close();
}
}
