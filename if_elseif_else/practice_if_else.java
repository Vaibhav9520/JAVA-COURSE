// //Question1: Write a Java program to get a number from the user and print 
// // whether it is positive or negative.

// /* 
// import java.util.*;

// public class practice_if_else {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the digit ");
//         int a = sc.nextInt();
//         if (a>0){
//             System.out.println("Positive");
//         }else if(a==0){
//             System.out.println("Equal to zero");
//         }else{
//             System.out.println("Negative");
//         }
        
//     }
// }
// */
// //------------------------------------------------------------------
// //Question2: Finish the following code so that it prints.
// // You have a fever if your temperature is above 100 and otherwise,
// // prints You don't have a fever.

// /*
// import java.util.*;

// public class practice_if_else {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Entr the temperature ");
//         int temp = sc.nextInt();
//         if (temp>100){
//             System.out.println("You have fever");
//         }else if(temp == 100){
//             System.out.println("You have normal");
//         }else{
//             System.out.println("You don't have a fever");
//         }
        
//     }
// }
// */
// //---------------------------------------------------------------------
// //Question 3: Write a Java program to input week number(1-7) and print 
// // day of week name using swite case.
// /*
// import java.util.*;

// public class practice_if_else {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Select one Digit ");
//         int Dig = sc.nextInt();
//         switch(Dig){
//             case 1:System.out.println("Sunday");
//                 break;
//             case 2:System.out.println("Monday");
//                 break;
//             case 3:System.out.println("Tuesday");
//                 break;
//             case 4:System.out.println("Wednesday");
//                 break;
//             case 5:System.out.println("Thrusday");
//                 break;
//             case 6:System.out.println("Friday");
//                 break;
//             case 7:System.out.println("Saturday");
//                 break;
//             default:System.out.println("Wrong input");


//         }
//     }
// }
// */
// //--------------------------------------------------------------------
// //Question 4 : What will be the value of x & y in the following program.
// /*
// public class practice_if_else{
//     public static void main(String args[]){
//         int a = 63, b = 36;
//         boolean x= (a<b)?true:false;
//         int y= (a>b)?a:b;
//         System.out.println(x);
//         System.out.println(y);

//     }
// }
// */
// //-----------------------------------------------------------------------
// // Question 5 : Write a Java program that takes a year from the user and print 
// //whether that year is a leap year or not.

// import java.util.*;

// public class practice_if_else {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Input the year ");
//         int year = sc.nextInt();
//          Boolean x = (year % 4) == 0;
//          Boolean y = (year % 100) !=0;
//          Boolean z = ((year % 100 ==0 ) && (year % 400 ==0 ));
//          if(x && (y||z)){
//             System.out.println("Leap Year");
//          }else{
//             System.out.println("Not a Leap year");
//          }     
//     }
// }