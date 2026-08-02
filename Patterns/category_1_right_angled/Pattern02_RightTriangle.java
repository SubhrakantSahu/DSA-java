
/*
*
* *
* * *
* * * *
* * * * *
*/

import java.util.Scanner;

public class Pattern02_RightTriangle {
public static void main(String []Args){
    System.out.println("Enter the no count ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i = 1; i<= n ; i++){
        for (int j = 1; j<= i ; j++){
            System.out.print("* ");
        }
        System.out.println();
    }
    sc.close();
}
    
}
