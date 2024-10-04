import java.util.Scanner;

public class insertionSort{
        public static void printArr(int arr[],int size){
            for (int i = 0; i < size; i++) {
                System.out.println(arr[i]);
        }
}
    public static void insertionArr(int arr[],int size,int n){
        int pos, num;
        System.out.println("Enter position: ");
        Scanner sc = new Scanner(System.in);
        pos = sc.nextInt();
        System.out.println("Enter Element: ");
        num = sc.nextInt();
        for (int i = n - 1; i >= pos - 1; i--) {
        arr[i + 1] = arr[i];
    }
    arr[pos - 1] = num;
    }

public static void insertionSort1(int arr[],int n){
    int temp; 
    int j;
    for (int i = 1; i < n + 1; i++) {
        temp = arr[i];
        j = i - 1;

        while (j >= 0 && arr[j] > temp) {
            arr[j + 1] = arr[j];
            j--;
        }

        arr[j + 1] = temp;
    }

}
    public static void main(String[] args) {
        System.out.println("Enter the Number of elements: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = {56,98,58,78,23,65};
        int n = size;
        int temp;
        int j;
        insertionArr(arr, size, n);

        insertionSort1(arr, n);
        System.out.println("-------------Array After short-------------------");
        printArr(arr, size);
    }
}