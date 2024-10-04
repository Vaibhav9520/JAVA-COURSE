// //Question 1 :Write a Java method to compute the average of three numbers.
// // import java.util.*;
// // public class Practice{
// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);
// //         System.out.println("Enter First number");
// //         int a = sc.nextInt();
// //         System.out.println("Enter Second number");
// //         int b = sc.nextInt();
// //         System.out.println("Enter Third number");
// //         int c = sc.nextInt();
// //         System.out.println("Average is "+ average(a, b, c));
// //     }
// //     public static double average(double a, double b, double c){
// //         return (a + b + c)/3;
// //     }
// // }
// //=======================================================================

// //Question 2 : Write a method named isEven that accepts an int argument.
// //The method should return true if the argument is even,or false otherwise.
// // Also write a program to test your metho


// // import java.util.*;


// // public class Practice{
// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);
// //         int num;

// //         System.out.println("Enter a number");
// //         num = sc.nextInt();

// //         if(isEven(num)){
// //             System.out.println("Number is Even");
// //         }else{
// //             System.out.println("Number is Odd");       
// //         }

// //     }
// //     public static boolean isEven(int num){
// //         if (num%2==0){
// //             return true;
// //         }else{
// //             return false;
// //         }
// //     } 
// // }
// //--------------------------------------------------------------------------------------------
// //Question 3= check if a number is a palindrome or not??

// import java.util.*;


// public class Practice{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number");
//          int num = sc.nextInt();

//         if(isPalindrome(num)){
//             System.out.println("Number "+ num + "is a Palindrome");
//         }else{
//             System.out.println("Number " + num + "Not a palindrome");       
//         }

//     }
//     public static boolean isPalindrome(int number){
//         int palindrome = number;
//         int reverse = 0;
//         while(palindrome !=0){
//             int remainder = palindrome % 10;
//             reverse = reverse * 10 + remainder;
//             palindrome = palindrome / 10;
//         }
//         if (number == reverse){
//             return true;
//         }else{
//             return false;
//         }
//     } 
// }