// // Solid Rombus
// public class Rombus {
//     public static void solid_rombus_pattern(int n) {
//         //For outer lopp
//         for(int i=1;i<=n;i++){
//             //spaces in inner loop
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             //Stars in inner loop
//             for(int j=1;j<=n;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
        
//     }
//     public static void main(String[] args) {
//         solid_rombus_pattern(6);
//     }
// }

//-------------------------_______________________-----------------________________
// Hollow Rombus
public class Rombus {
    public static void hollow_rombus_pattern(int n) {
        //For outer lopp
        for(int i=1;i<=n;i++){
            //for inner loop
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        hollow_rombus_pattern(10);
    }
}
