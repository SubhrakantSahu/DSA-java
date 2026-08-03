/*
 * Pattern 15: Reverse Alphabet Triangle
 * 
 * E
 * E D
 * E D C
 * E D C B
 * E D C B A
 * 
 */

import java.util.Scanner;

public class Pattern15_ReverseAlphabetTriangle {
    public static void main(String []Args){
    System.out.println("Enter the no count ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = n ;
    System.out.println("Your pattern is ");
   
    for(int i=n;i>=1;i--){
        
        for(int j = n; j >= i ; j--){
            System.out.print((char) (j+64));
        
        }
        System.out.println();
    }
    sc.close();
    }
}
