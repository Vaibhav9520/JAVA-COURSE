public class Dimond {
    public static void dimond_pattern(int n) {
        //outer loop
        for(int i=1;i<=n;i++){
            //Inner loop spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //for stars in inner loop
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();

        }
        //Second half
        for(int i=n;i>=1;i--){
            //Inner loop spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //for stars in inner loop
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();

        }


    }

    public static void main(String[] args) {
        dimond_pattern(5);
    }
}
