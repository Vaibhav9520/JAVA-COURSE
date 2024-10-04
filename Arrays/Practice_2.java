//Question 1:Given an integer array nums, return true if any value appears at
// least twice in the array, and return false if every element is distinct.
//Example 1:
//Input:nums = [1, 2, 3, 1]
//Output:   true 
//Example 2:Input:nums = [1, 2, 3, 4]
//Output:   false 
//Example 3:Input:nums = [1, 1, 1, 3, 3, 4, 3, 2, 4, 2]
//Output:   true 
//Constraints:•1 <= nums .  lengtth <= 105•-109 <= nums [ i ] <= 10pow9.


// public class Practice_2 {
//     public static boolean CheckNum(int nums[]){
//         for(int i=0;i<nums.length-1;i++){
//             for(int j = i+1 ; j< nums.length;j++){
//                 if(nums[i] == nums[j]){
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
//     public static void main(String[] args) {
//         int nums[] = {1,1,1,3,3,4,3,2,4,2};
//         System.out.print(CheckNum(nums));
//     }
    
// }

//========================================================================
//Question 3: You  are  given  an  array prices where prices[i] is  the  price
//  of  a  given  stock  on  the ith day. Return the maximum profit you can 
//achieve from this transaction. If you cannot achieve any profit, return 0.
// Example 1:Input:prices = [7, 1, 5, 3, 6,  4]   
// Output:   5 
//Explanation:Buy on day 2 (price = 1) and sell on day 5 (price = 6),
// profit = 6-1 = 5. Note that buying on day 2 and selling on day 1 is not 
//allowed because you must buy before you sell.
//Example 2: Input:Prices = [7, 6, 4,  3, 1]   
//Output:   0 
//Explanation:In this case, no transactions are done and the max profit = 0.
//Constraints:•1 <= prices . length <= 105•0   <= prices [ i ] <= 104 .



// public class Practice_2{
//     public static int CheckProfit(int prices[]) {
//         int buyPrices = Integer.MAX_VALUE;
//         int maxProfit = 0;
//         for(int i=0;i<prices.length;i++){
//             if(buyPrices < prices[i]){
//                 int profit = prices[i] - buyPrices;
//                 maxProfit = Math.max(maxProfit, profit); 
//             }else{
//                 buyPrices = prices[i];
//             }
//         }
//         return maxProfit;
        
//     }
//     public static void main(String[] args) {
//         int prices[] = {7,1,5,3,6,4};
//         System.out.print("Profit : " + CheckProfit(prices));
//     }
// }

//============================================================================
 // Question 4:Given n non-negative integers representing an elevation map where
 // the width of each bar is 1, compute how much water it can trap after raining.
 // Example 1:Input:height = [0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1]
 //Output:   6 
 //Explanation:The above elevation map (black section) is represented by array
 // [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section)
 // are being trapped.
 //Example 2:Input:height = [4, 2, 0, 3, 2, 5]Output:   9 Constraints:•n == height . length•1 <= n <= 2 * 104•0 <= height [ i ] < = 10

//  public class Practice_2{
//     public static int CheckRainWater(int height[]){
//         int n = height.length;
//         // no rain water will be stored in this range;
//         if(n<=2){
//             return 0;
//         }
//         int leftMax[] = new int[n];
//         int rightMax[] = new int[n];

//         // for leftmax values;
//         leftMax[0] = height[0];
//         for(int i=1;i<n;i++){
//             leftMax[i] = Math.max(height[i],leftMax[i-1]);
//         }

//         // for right max values;
//         rightMax[n-1] = height[n-1];
//         for(int i=n-2;i>=0;i--){
//             rightMax[i] = Math.max(height[i],rightMax[i+1]);
//         }

//         // for trapping water
//         int trappedWater = 0;
//         for(int i=0;i<n;i++){
//             int waterLevel = Math.min(leftMax[i],rightMax[i]);
//             trappedWater += waterLevel - height[i];
//         }

//         return trappedWater;

//     }
//     public static void main(String[] args) {
//         //int height[] ={0,1,0,2,1,0,1,3,2,1,2,1};
//          int height[] = {4,2,0,3,2,5};
//         System.out.print("trapped Water : " + CheckRainWater(height));
//     }
//  }

//===========================================================================
