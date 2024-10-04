// // We are swap twwo number without using third veriable........................
// public class BitManupulation {
//     public static void main(String[] args) {
//         int x = 5 , y = 10;
//         System.out.println("Before Swapping x: " + x + " and y: " + y );
//         //Swaping
//         x = x ^ y;
//         y = y ^ x;
//         x = x ^ y;
//         System.out.println("After Swapping x: " + x + " and y: " + y );

        
//     }
    
// }

// //Question 3 :Add 1 to an integer using Bit Manipulation.
// public class BitManupulation{
//     public static void main(String[] args) {
//         int x = 7;
//         System.out.println(x + " + " + "1"+ " is " + -~x);
//         x = -7;
//         System.out.println(x + " + " + "1"+ " is " + -~x);
//         x = 0;
//         System.out.println(x + " + " + "1"+ " is " + -~x);
//     }
// }

//Question 4 :This question is based on a trick, pleasedirectly look at the solution.
// Convert uppercase characters to lowercase using bits.

public class BitManupulation{
    public static void main(String[] args) {
        for(char ch = 'A' ; ch <= 'Z' ; ch++){
            System.out.print((char) (ch | ' ') + " ");
        }
    }
}
 