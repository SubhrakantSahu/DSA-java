/*
 * Pattern 27: Centered Star Pyramid
 * 
 *         *
 *       * * *
 *     * * * * *
 *   * * * * * * *
 * * * * * * * * *
 * 
 */



package CATEGORY_3_PYRAMIDS_AND_DIAMONDS;

import java.util.Scanner;

public class Pattern27_CenteredStarPyramid {
    public static void main(String[]Args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
    int n = sc.nextInt();
    System.out.println("Your pasattern is ");
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" "+" ");//did it by coutning space and stars pattern sequentially 
        }
        for(int j=1;j<= (2*i-1);j++){
            System.out.print("*"+" ");
        }
        System.out.println();

    }
    //another method is there 
    /*no of spaces are decreasing so we will start it with a variable 
    1st line 4 spaces thats n-1 then decreases by 1 
    star starts from 1 increases up to n */
    // int nsp = n-1,nst=1;
    
    //  for(int i=1;i<n;i++){
    //     for(int j=1;j<nsp;j++){
    //         System.out.print(" "+" ");//did it by coutning space and stars pattern sequentially 
    //     }
    //     for(int j=1;j<=nst;j++){
    //         System.out.print("*"+" ");
    //     }
    //     nst+=2;
    //     nsp--;
    //     System.out.println();

    // }
    sc.close();
    }
}