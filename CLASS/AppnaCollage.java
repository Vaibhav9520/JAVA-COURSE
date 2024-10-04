// public class AppnaCollage{
//     public static void main(String[] args){
//         System.out.println("Hello World");
//         System.out.println("Hello World");
//         System.out.println("Hello World");
//         System.out.println("Hello World");
//     }
// }



// public class AppnaCollage {
//     public static void main(String[] args) {
//         System.out.println("* * * * ");
//         System.out.println("* * *  ");
//         System.out.println("* *  ");
//         System.out.println("* ");
//     }
// }


class AppnaCollage {
    public static void main(String[] args) {
  
      int base = 10, exponent = 5;
  
      long result = 1;
  
      while (exponent != 0) {
        result *= base;
        --exponent;
      }
  
      System.out.println("Answer = " + result);
    }
  }