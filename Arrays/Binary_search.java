import java.util.*;
public class Binary_search {
    public static int search_key(int numbers[] , int key) {
        //serching the key by the help of BINARY SEARCH
        int start = 0 ;
        int end = numbers.length-1;
        while(start <= end) {
            int mid = (start + end)/2;
            if(key == mid){           //comparision
                return mid;
            }
            if(numbers[mid] > key){
                end = mid-1;
            }else{
                start = mid+1;
            }
            
        }
        return -1;
        
    }
    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,5,6,7,8,9,10};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key ");
        int key = sc.nextInt();
        int index = search_key(numbers , key);
        if(index == -1){
            System.out.println("Key not found");
        }else{
            System.out.println("Key found at place "+ index);
        }
    }
}
