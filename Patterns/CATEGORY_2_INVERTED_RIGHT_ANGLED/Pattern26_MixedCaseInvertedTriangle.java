/*
 * Pattern 26: Mixed-Case Inverted Triangle
 * 
 * A B C D E
 * a b c d
 * A B C
 * a b
 * A
 * 
 */

import java.util.Scanner;

public class Pattern26_MixedCaseInvertedTriangle {

    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number ");
        int n = sc.nextInt();
        System.out.println("Your pattern is ");
        for (int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print((i%2==0) ? (char)( j+96) +" " : (char)(j+64)+" ");
            }
            System.out.println("");
        }

        //Another way of doing it is playing with the loops 
        // for (int i=n;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print((i%2==0) ? (char)( j+96) +" " : (char)(j+64)+" ");
        //     }
        //     System.out.println("");
        // }
        sc.close();
}
    }
    
