package com.dev.arrays;

public class BestTimeToBuyStocks {
    //bruit force time limit exceed-----
    // public int maxProfit(int[] prices) {
    //     int max=0;
    //     for(int i=1;i<prices.length;i++){
    //         int min=prices[i];
    //         for(int j=0;j<i;j++){
    //            min=Math.min(min,prices[j]);
    //         }
    //         //System.out.println(min+" "+ prices[i]);
    //         max=Math.max(max,prices[i]-min);
    //     }
    //     return max;
    // }

    public int maxProfit(int[] prices){
        int min=prices[0];
        int max=0;
        for(int i=0;i<prices.length;i++){
            // System.out.println(min+" "+max);
            min=Math.min(min,prices[i]);
            max=Math.max(max,prices[i]-min);
        }
        return max;
    }
}