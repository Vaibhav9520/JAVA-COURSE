public class sudoku {
    public static void printSuduko(int arr[][]){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static boolean isSafe(int arr[][],int row,int col,int digit){
        //coloum
        for(int i=0;i<=8;i++){
            if(arr[i][col] == digit){
                return false;
            }
        }
        //row
        for(int j=0;j<=8;j++){
            if(arr[row][j] == digit){
                return false;
            }
        }
        //grid
        int sr = (row/3) * 3;
        int sc = (col/3) * 3;
        //3*3 grid
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<=sc+3;j++){
                if(arr[i][j] == digit){
                    return false;
                }
            }
        }
        return true;

    }
    public static boolean SudokuChecker(int arr[][],int row,int col){
        
        //base case
        if((row==9) && (col == 0)){
            return true;
        }
        
        //recursion
        int nextRow = row;
        int nextCol = col+1;
        if(col+1 ==9){
            nextRow = row+1;
            nextCol = 0;
        }

        if(arr[row][col] !=0){
            return SudokuChecker(arr, nextRow, nextCol);
        }
        for(int digit = 1;digit<=9;digit++){
            if(isSafe(arr,row,col,digit)){
                arr[row][col] = digit;
                if(SudokuChecker(arr, nextRow, nextCol)){
                    return true;
                }
                arr[row][col] = 0;
            }
        }
        return false;
        }
    }
    public static void main(String[] args) {
        int arr[][] = {
            {0,0,8,0,0,0,0,0,0},
            {4,9,0,1,5,7,0,0,2},
            {0,0,3,0,0,4,1,9,0},
            {1,8,5,0,6,0,0,2,0},
            {0,0,0,0,2,0,0,6,0},
            {9,6,0,4,0,5,3,0,0},
            {0,3,0,0,7,2,0,0,4},
            {0,4,9,0,3,0,0,5,7},
        };
        if(SudokuChecker(arr, 0, 0)){
            System.out.println("Solution Exits");
            printSuduko(arr);
        }else {
            System.out.println("Solution does not exits");
        }
    }
    
}
