// public class Flyode {
//     public static void flyode_triangle(int n) {
//         int counter = 1;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<i;j++){
//                 System.out.print(counter + " ");
//                 counter++;
                
//         }
//         System.out.println();}

//     }
//     public static void main(String[] args) {
//         flyode_triangle(5);
//     }
// }
//=====================================================================


public class Flyode {
    public static void zero_and_one_triangle(int n) {
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
                }
                System.out.println();
        }
    }
    public static void main(String[] args) {
        //flyode_triangle(5);
        zero_and_one_triangle(6);
    }
}
