//package JAVA COURSE.BackTracking;

public class onArray {
    public static void ChangeArr(int arr[], int i, int val) {
        // Base case
        if(i == arr.length){
            PrintArr(arr);
            return;
        }


        //Recursion
        arr[i] = val;
        ChangeArr(arr, i+1, val+1);  //calling the function
        arr[i] = arr[i] -2;          // Doing backtracking

        
    }
    public static void PrintArr(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
    }
    public static void main(String[] args) {
        int arr[] = new int[5];
        ChangeArr(arr, 1, 2);
        PrintArr(arr);

    }
}
