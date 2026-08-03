/*  
*****
*****
*****
*****
*****
*/

import java.util.Scanner;

public class Pattern01_SolidSquare{
public static void main(String[] Args){
    System.out.println("Print the count ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
     System.out.println("Your pattern is ");
    for(int i = 1; i<=n;i++){
        for ( int j = 1 ;j<=n ; j++){
            System.out.print("* ");
        }
        System.out.println();
    }
    sc.close();
}
}
