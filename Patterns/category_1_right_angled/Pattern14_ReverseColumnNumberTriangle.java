/*
 * Pattern 14: Reverse Column Number Triangle
 * 
 * 5
 * 5 4
 * 5 4 3
 * 5 4 3 2
 * 5 4 3 2 1
 * 
 */

import java.util.Scanner;

public class Pattern14_ReverseColumnNumberTriangle {
    public static void main(String []Args){
    System.out.println("Enter the no count ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = n ;
    System.out.println("Your pattern is ");
   
    for( int i =1 ;i<=n;i++){
        k=n;
        for(int j = 1 ; j <= i ; j++){
            System.out.print(k);
            k--;
        }
        System.out.println();
    }
    //anohter method playwith the outer inner loop
    // for( int i = n;i>=0;i--){
        
    //     for(int j = n ; j >= i  ; j--){
    //         System.out.print(j);
            
    //     }
    //     System.out.println();
    // }

    //Another method playwith the inner loop  

// for( int i = 1; i<=n ; i++){
        
//         for(int j = n ;  j>= n+1-i or j > n-i  ; j--){
//             System.out.print(j);
            
//         }
//         System.out.println();
//     }
    
    sc.close();
}
}
