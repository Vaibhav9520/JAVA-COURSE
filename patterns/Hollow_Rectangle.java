public class Hollow_Rectangle {
    public static void hollow_rectangle(int tolRows, int tolCols) {
        // For printing the outer loop.
        for(int i=1;i<=tolRows;i++){
            // For printing the inner loop.
            for(int j=1;j<=tolCols;j++){
                //For check the boundary condition.
                if(i==1 || i== tolRows || j==1 || j== tolCols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.println();
        }
        
    }
    public static void main(String[] args) {
        hollow_rectangle(4,6);
        
    }
}
