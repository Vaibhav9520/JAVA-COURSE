//import java.util.*;
public class DSA_buy_sell {
    public static int buySellPrice(int prices[]){
        int n = prices.length;
        int buyPrices = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0;i<n;i++){
            if(buyPrices < prices[i] ){          // profit
                    int profit = prices[i] - buyPrices;
                    maxProfit = Math.max(maxProfit,profit);
            }else{
                buyPrices = prices[i];
            }
        }
        return maxProfit;


    }
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println("Profit : " +  buySellPrice(prices));
    }
    
}
