/*
 * Pattern 28: Inverted Star Pyramid
 /*
 * Pattern 28: Inverted Star Pyramid
 * 
 * * * * * * * * * * 
 *   * * * * * * * 
 *     * * * * * 
 *       * * * 
 *         * 
 * 
 */
 


package CATEGORY_3_PYRAMIDS_AND_DIAMONDS;

import java.util.Scanner;

public class Pattern28_InvertedStarPyramid {
    public static void main(String[]Args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
    int n = sc.nextInt();
    System.out.println("Your pasattern is ");
    for(int i=n;i>=1;i--){
        for(int j=1;j<=n-i;j++){
            System.out.print(" "+" ");//did it by coutning space and stars pattern sequentially 
        }
        for(int j=1;j<= (2*i-1);j++){
            System.out.print("*"+" ");
        }
        System.out.println();

    }
    //another method is there 
/*
no of space at first line is 0 but increasing so take a constant 
no of starts decreasing so take a variable */ 
    // int nsp = 0,nst=(2*n)-1;
    
    //  for(int i=1;i<=n;i++){
    //     for(int j=1;j<=nsp;j++){
    //         System.out.print(" "+" ");//did it by coutning space and stars pattern sequentially 
    //     }
    //     for(int j=1;j<=nst;j++){
    //         System.out.print("*"+" ");
    //     }
    //     nst-=2;
    //     nsp++;
        
    //     System.out.println();

    // }
    sc.close();//;
    }
}
