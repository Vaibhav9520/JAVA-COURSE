// //package JAVA COURSE.Recursion;

// public class factorial {
//     public static int PrintFact(int n) {
        
//         if(n == 0){
//             return 1;
//         }
//         int fact = n * PrintFact(n-1);
//         return fact;


        
//     }
//     public static void main(String[] args) {
//         int n = 5;
//         System.out.println("Factorial of " + n +" is " + PrintFact(n));
//     }
    
// }

// sum of n natural numbers.
public class factorial {
    public static int SumNatural(int n) {
        
        if(n == 0){
            return 1;
        }
        int sum = n + SumNatural(n-1);
        return sum;


        
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Sum of " + n +" Natural numbers is " + SumNatural(n));
    }
    
}

