/*
 * Pattern 16: Mixed-Case Character Ramp (Alternating Columns)
 * 
 * A
 * A b
 * A b C
 * A b C d
 * A b C d E
 * 
 */

import java.util.Scanner;

public class Pattern16_MixedCaseColumnRamp {
    public static void main(String []Args){
    System.out.println("Enter the no count ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    System.out.println("Your pattern is ");
   
    for(int i=1;i<=n;i++){
        
        for(int j = 1; j <= i ; j++){
            System.out.print((j%2==0) ? (char) (j+96)+" " : (char) (j+64)+" ");
        
        }
        System.out.println();
    }
    sc.close();
    }
}
