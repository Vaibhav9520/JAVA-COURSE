// package JAVA COURSE.Sorting;

public class insertion_short {
    public static void InsertionSort(int arr[]){
        int n = arr.length;
        for(int i = 0;i<n;i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev >=0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            } 
            // inserion;
            arr[prev+1] = curr;
        }
    }
public static void PrintBubbleShort(int arr[]){
    for(int i=0;i<arr.length;i++){

        System.out.print(arr[i]  +" ");
    }System.out.println();
}
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        InsertionSort(arr);
        PrintBubbleShort(arr);
    }
    
}
