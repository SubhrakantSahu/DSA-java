/*
 * Pattern 11: Capital Alpha-Ramp Triangle
 * 
 * A
 * B B
 * C C C
 * D D D D
 * E E E E E
 * 
 */

import java.util.Scanner;

public class Pattern11_CapitalAlphaRampTriangle {
    public static void main(String []Args){
    System.out.println("Enter the no count ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println("Your pattern is ");
    
    for( int i =1 ;i<=n;i++){
        for(int j = 1 ; j <= i ; j++){
            System.out.print((char)(i+64)+" ");
           
        }
        System.out.println();
    }
    
    sc.close();
    }
}
