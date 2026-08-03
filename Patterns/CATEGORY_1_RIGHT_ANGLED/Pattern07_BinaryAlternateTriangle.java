/*
 * Pattern 07: Binary Alternate Triangle
 * 
 * 1
 * 0 1
 * 1 0 1
 * 0 1 0 1
 * 1 0 1 0 1
 * 
 */

import java.util.Scanner;

public class Pattern07_BinaryAlternateTriangle {
    public static void main(String []Args){
    System.out.println("Enter the no count ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println("Your pattern is ");
    for (int i = 1; i<= n ; i++){
        for (int j = 1; j<=i ; j++){
            if((i+j)%2 == 0)
                System.out.print("1 ");
            else
                System.out.print("0 ");
        
        }
        System.out.println();
    }
    // Another way of doing it is starting i from the reverse side - for the outer loop usiong ternary operator 
// for (int i = 1; i<= n ; i++){
//         for (int j = 1; j<=i ; j++){
//             System.out.print((i+j)%2 == 0 ? "1 " : "0 " );
        
//         }
//         System.out.println();
//     }
   //Antoher way of doing it is taking a flag and incrweasing after every j every no printed 
   
//    boolean Flag = true;
//    for (int i = 1; i<= n ; i++){
//         for (int j = 1; j<=i ; j++){
//             if(Flag)
//             System.out.print("1 ");
//          else
//             System.out.print("0 ");
//         Flag = !Flag;
//         }
//         System.out.println();
//     }
    sc.close();
}
}
