public class Inverted_prymid {
    public static void inverted_half_prymid(int tolRows) {
        // for outer loop
        for(int i=1;i<=tolRows;i++){
            //for spaces
            for(int j=1;j<=tolRows-i;j++){
                System.out.print(" ");
            }
                //for stars
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        inverted_half_prymid(5);
    }
}
 //=========================================================================

//  public class Inverted_prymid {
//     public static void inverted_half_prymid_numbers(int n) {
//         // for outer loop
//         for(int i=1;i<=n;i++){
            
//                 for(int j=1;j<=n-i+1;j++){
//                     System.out.print(j +" ");
                
//             }
//             System.out.println();
//         }
        
//     }
//     public static void main(String[] args) {
//         System.out.println("hello");
      
//         inverted_half_prymid_numbers(5);
//     }
// }
 