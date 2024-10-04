public class DSA_trapping_water {
    public static int trappingRainWater(int height[]) {
        int n = height.length;

        int leftMax[] = new int[n];
        int rightMax[] = new int[n];

        if(n<=2){                                         // No water trapped into this water level.
            return 0;         
        }

        leftMax[0] = height[0];                         // for left max value
        for(int i=1;i<n;i++){
            leftMax[i] = Math.max(height[i],leftMax[i-1]);
        }

        rightMax[n-1] = height[n-1];                    // For right max value
        for(int i=n-2;i>=0;i--){
            rightMax[i] = Math.max(height[i],rightMax[i+1]);
        }
         
        int trappingWater = 0;                         // for traping water;
        for(int i=0;i<n;i++){
            int waterLevel = Math.min(leftMax[i],rightMax[i]);
            trappingWater += waterLevel - height[i];
        }
        return trappingWater;
        
    }
    public static void main(String args[]) {
        int height[] = {4,2,0,6,3,2,5};
        int totalStoredWater = trappingRainWater(height);
        System.out.println("Total trapped water is " + totalStoredWater);

    }
    
}
