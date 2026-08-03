/*
 * Pattern 04: Right-Angled Number Triangle (Repeated Row Numbers)
 * 
 * 1
 * 2 2
 * 3 3 3
 * 4 4 4 4
 * 5 5 5 5 5
 * 
 */

import java.util.Scanner;

public class Pattern04_RightTriangleSameNumber {
    public static void main(String []Args){
    System.out.println("Enter the no count ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println("Your pattern is ");
    for (int i = 1; i<= n ; i++){
        for (int j = 1; j<= i ; j++){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    sc.close();
}
}
