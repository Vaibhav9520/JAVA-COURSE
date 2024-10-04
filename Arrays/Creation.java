import java.util.*;

public class Creation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n;
        n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Element of array: ");

        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
           
        }
    }
}
