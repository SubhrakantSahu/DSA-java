import java.util.Scanner;

public class Pattern12_SmallAlphaRampTriangle {
  
    public static void main(String []Args){
    System.out.println("Enter the no count ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println("Your pattern is ");
    
    for( int i =1 ;i<=n;i++){
        for(int j = 1 ; j <= i ; j++){
            System.out.print((char)(i+96)+" ");
           
        }
        System.out.println();
    }
    
    sc.close();
    }
    }

