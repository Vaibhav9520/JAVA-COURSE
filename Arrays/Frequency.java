class Frequency{ 
    public static void main(String[] args) {
        int n = 6;
        int arr[] = {4, 4, 5, 6, 7, 5};
        int temp[] = new int[n];
        boolean visited[] = new boolean[n];

        for(int i=0; i<n; i++){
           if(visited[i] == true)
                continue;

            int count = 1;
            for(int j=i+1; j<n; j++){
                if(arr[i] == arr[j]){
                    count++;
                    visited[j] = true; 
                }
            }
            temp[i] = count;
        }
        
        System.out.println("After Frequency:");
        for(int i=0; i<n; i++){
            if(!visited[i])
                System.out.println("Element " + arr[i] + " has " + temp[i] + " times frequency.");
        }
    }
}
