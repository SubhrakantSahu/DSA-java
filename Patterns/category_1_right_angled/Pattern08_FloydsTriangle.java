
/*
 * Pattern 08: Floyd’s Triangle
 * 
 * 1
 * 2 3
 * 4 5 6
 * 7 8 9 10
 * 11 12 13 14 15
 * 
 */
import java.util.Scanner;

public class Pattern08_FloydsTriangle {
    public static void main(String []Args){
    System.out.println("Enter the no count ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println("Your pattern is ");
    int a = 1;
    for( int i =1 ;i<=n;i++){
        for(int j = 1 ; j <= i ; j++){
            System.out.print(a +" ");
            a++;
        }
        System.out.println();
    }
    
    sc.close();
}
}
