public class Spring_matrix {
    public static void PrintingSpringMatrix(int matrix[][]) {
        int n = matrix.length;          //for find the length of Row.
        int m = matrix[0].length;       //for find the length of coloum.
        int StartRow = 0;
        int EndRow = n-1;
        int StartCol = 0;
        int EndCol = m-1;

  
        while(StartRow <= EndRow && StartCol <= EndCol){
            // Printing top
            for(int j = StartCol; j <= EndCol; j++){
            System.out.print(matrix[StartRow][j]+ " ");
            }
            // Printing right
            for(int i = StartRow +1 ; i <= EndRow ;i++){
                System.out.print(matrix[i][EndCol]+ " ");
            }
            // Printing bottem
            
            for(int j = EndCol -1 ; j >= StartCol ; j--){
                if(StartRow == EndRow){
                    break;
                }
                System.out.print(matrix[EndRow][j]+ " ");
            }
        
            // Printing left
            
            for(int i = EndRow -1  ; i >= StartRow +1 ; i--){
                if(StartCol == EndCol){
                    break;
                }
                System.out.print(matrix[i][StartCol]+ " ");
            }
        
            StartRow++;
            StartCol++;
            EndRow--;
            EndCol--;
        }
        

        
    }
    public static void main(String[] args) {
        int matrix[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}};

        PrintingSpringMatrix(matrix);
            
    }
    
}
