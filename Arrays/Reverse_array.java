public class Reverse_array {
    public static void reverse_array(int numbers[]) {
        int first = 0;
        int last = numbers.length-1;
        while(first < last){
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;
            first++;
            last--;
        }
        // j=arr.length;
        // int[] copy=new int[arr.length];
        // for(int i=0;i<arr.length;i++){
        //     ans[j-1]=arr[i];
        //     j--;
        // }
    }
    public static void main(String[] args) {
        int numbers[] = {5,10,15,20,25,30,25,40,45,50};
        System.out.print("Original Array :");
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i] + " ");
        }System.out.println();
        reverse_array(numbers);
        System.out.print("Reverse Array : ");
        // printing array;
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i] + " ");
        }System.out.println();

    }
}
