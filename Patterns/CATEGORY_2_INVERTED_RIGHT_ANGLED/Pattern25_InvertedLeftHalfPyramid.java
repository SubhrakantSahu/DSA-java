import java.util.Scanner;
/*
 * Pattern 25: Inverted Left-Half Pyramid (Right-aligned with spaces)
 * 
 * * * * * *
 *   * * * *
 *     * * *
 *       * *
 *         *
 * 
 */

public class Pattern25_InvertedLeftHalfPyramid {
     public static void main(String []Args){
    System.out.println("Enter the no count ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
     System.out.println("Your pattern is ");
    //  for(int i = 1;i<=n;i++){
    //     for(int j = 1 ; j<=i-1;j++){
    //         System.out.print(" "+" ");//one extra space for better visibility we will add extra space at every where 
    //     }
    //     for(int j=1;j<=n-i+1;j++){
    //         System.out.print("*"+" ");//one extra space for better visibility we will add extra space at every where 
    //     }
    //     System.out.println();
    //  }


     //another method is no of spaces (nst) and no of stars() technique
     /* whichever variable increases we will start it with its initial value and the value that 
     decrease we will make a variable using n which will match its number 
     in first line
     so spaces increasing nsp =1 
     starts decreasing no of stars at first line is 5 that is n(5) (For first 
     row ) */

     int nsp =0;
     int nst = n;
     for(int i = 1;i<=n;i++){
        for(int j = 1 ; j<=nsp;j++){
            System.out.print(" "+" ");//one extra space for better visibility we will add extra space at every where 
        }
        for(int j=1;j<=nst;j++){
            System.out.print("*"+" ");//one extra space for better visibility we will add extra space at every where 
        }
        nst--;
        nsp++;
        System.out.println();
     }
     sc.close();
}
}
