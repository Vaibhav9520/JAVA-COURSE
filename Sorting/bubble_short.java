//package JAVA COURSE.Sorting;

public class bubble_short {
    public static void bubbleShort(int arr[]){
        // bubble  short
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int Swap = 0;
            for(int j=0;j<n-1-i;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                   
                }
                Swap++;
            }
            System.out.println("Swap: " + Swap);
        }
    }
public static void PrintBubbleShort(int arr[]){
    for(int i=0;i<arr.length;i++){

        System.out.print(arr[i]  +" ");
    }System.out.println();
}
    public static void main(String[] args) {
        // int arr[] = {5,4,1,3,2};
        int arr[] = {1,2,3,4,5};
        bubbleShort(arr);
        PrintBubbleShort(arr);


}
    
}
