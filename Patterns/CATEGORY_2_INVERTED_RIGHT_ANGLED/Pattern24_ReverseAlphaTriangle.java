import java.util.Scanner;
/*
 * Pattern 24: Reverse Alpha Triangle (Ending at E)
 * 
 * E
 * E D
 * E D C
 * E D C B
 * E D C B A
 * 
 */

public class Pattern24_ReverseAlphaTriangle {
     public static void main(String []Args){
    System.out.println("Enter the no count ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
     System.out.println("Your pattern is ");
    // for (int i = 1; i<= n ; i++){
    //     for (int j = 1; j<=i ; j++){
    //         System.out.print((char)((n-j+1)+64) + " ");
    //     }
    //     System.out.println();
    // }

    //Another way - playwith the oputer loop
    for (int i = n; i >= 1 ; i--){
        for (int j = 1; j<= i ; j++){
            System.out.print((char)((n-j+1)+64)+" ");
        }
        System.out.println();
    }
     sc.close();
}
}
