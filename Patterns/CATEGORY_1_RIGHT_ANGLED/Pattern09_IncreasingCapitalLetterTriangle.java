/*
 * Pattern 09: Increasing Capital Letter Triangle
 * 
 * A
 * A B
 * A B C
 * A B C D
 * A B C D E
 * 
 */

import java.util.Scanner;

public class Pattern09_IncreasingCapitalLetterTriangle {
    public static void main(String []Args){
    System.out.println("Enter the no count ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println("Your pattern is ");
    
    for( int i =1 ;i<=n;i++){
        for(int j = 1 ; j <= i ; j++){
            System.out.print((char)(j+64));
           
        }
        System.out.println();
    }
    
    sc.close();
}
}
