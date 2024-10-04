//package Loops;

// public class for_loop {
//     public static void main(String[] args) {
//         for(int i=1;i<=10;i++){
//             System.out.println("Hello World");
//         }
//     }
    
// }
//--------------------------------------------------------------------
//Print a pattern
// import java.util.*;
// public class for_loop{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in); 
//         System.out.println("Enter the value of n ");
//         int n = sc.nextInt();
//         for(int i=0;i<=n;i++){
//             System.out.println("****");
            
//         }
        

//     }
// }
//---------------------------------------------------------------------
//Reverse a number

// public class for_loop{
//     public static void main(String[] args) {
//         int n = 250703;
//         while(n>0){
//             int lastDigit = n%10;
//             System.out.print(lastDigit);
//             n=n/10;
//         }
//         System.out.println();
//     }
// }
//----------------------------------------------------------------------


public class for_loop{
    public static void main(String[] args) {
        int n = 43210;
        int rev =0 ;
        while(n>0){
            int lastDigit = n%10;
            rev = rev*10+lastDigit;
            n=n/10;
        }
        System.out.println(rev);
    }
}