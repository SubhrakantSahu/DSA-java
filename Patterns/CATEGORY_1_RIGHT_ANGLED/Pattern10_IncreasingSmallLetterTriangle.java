/*
 * Pattern 10: Increasing Small Letter Triangle
 * 
 * a
 * a b
 * a b c
 * a b c d
 * a b c d e
 * 
 */
import java.util.Scanner;

public class Pattern10_IncreasingSmallLetterTriangle {
    public static void main(String []Args){
    System.out.println("Enter the no count ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println("Your pattern is ");
    
    for( int i =1 ;i<=n;i++){
        for(int j = 1 ; j <= i ; j++){
            System.out.print((char)(j+96));
           
        }
        System.out.println();
    }
    
    sc.close();
    }
}
