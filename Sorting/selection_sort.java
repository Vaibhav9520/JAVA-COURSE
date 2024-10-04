public class selection_sort{
    public static void SelectionSort(int arr[],int Swap){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int MinPos = i;
            for(int j=i+1;j<n;j++){
                if(arr[MinPos] > arr[j]){
                    MinPos = j;

                }
            }
            // Swap
            int temp = arr[MinPos];
            arr[MinPos]  = arr[i];
            arr[i] =  temp;
            Swap++; 
        }
        System.out.println("Total swap: "+ Swap);
    }
public static void PrintArray(int arr[]){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
}
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        int Swap=0;
        SelectionSort(arr, Swap);
        PrintArray(arr);

        
    }

}