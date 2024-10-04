public class Butterfly {
    public static void butterfly_pattern(int n) {
        //for outer loop
        for(int i=1;i<=n;i++){
            //For inner loop spaces
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            // for inner space
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //for inner stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // Second half
        for(int i=n;i>=1;i--){
            //For inner loop spaces
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            // for inner space
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //for inner stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
    public static void main(String[] args) {
        butterfly_pattern(6);
    }
}
