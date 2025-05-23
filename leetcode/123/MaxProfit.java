import java.util.Arrays;

import javax.sound.midi.Soundbank;

class MaxProfit {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.maxProfit(new int[] { 3, 3, 5, 0, 0, 3, 1, 4 }));

        Solution1 s1 = new Solution1();
        System.out.println(Arrays.toString(new int[] { 3, 3, 5, 0, 0, 3, 1, 4 }));
        System.out.println(s1.maxProfit(new int[] {3,3,5,0,0,3,1,4}));

        Solution2 s2 = new Solution2();
        System.out.println(s2.maxProfit(new int[] { 3, 3, 5, 0, 0, 3, 1, 4 }));
    }
}
    
class Solution {
    public int maxProfit(int[] prices) {
        int buy1 = Integer.MIN_VALUE;
        int buy2 = Integer.MIN_VALUE;
        int sell1 = 0;
        int sell2 = 0;

        for (int i = 0; i < prices.length; i++) {
            buy1 = Math.max(buy1, -prices[i]);
            sell1 = Math.max(sell1, buy1 + prices[i]);
            buy2 = Math.max(buy2, sell1 - prices[i]);
            sell2 = Math.max(sell2, buy2 + prices[i]);
        }
        return Math.max(sell1, sell2);
    }
}

class Solution1{
    public int maxProfit(int[] prices) {
        int firstBuy = Integer.MAX_VALUE;
        int secondBuy = Integer.MAX_VALUE;
        int firstSell = 0;
        int secondSell = 0;
        
        System.out.println("firstBuy" + "," + "firstSell" + "," + "secondBuy" + "," + "secondSell");    
        for(int i = 0; i < prices.length; i++)
        {
            firstBuy = Math.min(firstBuy,prices[i]);
            firstSell = Math.max(firstSell,prices[i] - firstBuy);
            secondBuy = Math.min(secondBuy,prices[i] - firstSell);
            secondSell = Math.max(secondSell, prices[i] - secondBuy);
    
    
            System.out.println(firstBuy+"       ,"+firstSell+"        ,"+secondBuy+"        ,"+secondSell);
        } 
    // 
        return secondSell;
    }
}

class Solution2 {
    public int maxProfit(int[] prices) {
        if (prices.length < 2)
            return 0;

        int buy1 = prices[0];
        int sell1 = 0;

        int buy2 = prices[0];
        int sell2 = 0;

        for (int i = 0; i < prices.length; i++) {

            if (buy1 > prices[i])
                buy1 = prices[i];

            if (sell1 < prices[i] - buy1)
                sell1 = prices[i] - buy1;

            if (buy2 > prices[i] - sell1)
                buy2 = prices[i] - sell1;
            if (sell2 < prices[i] - buy2)
                sell2 = prices[i] - buy2;

        }
        return sell2;
    }
}
                     

    

            

                         

    

            

                         

    

            

                         

    

            

                           

                     

    

            

                         

    

            

        

    

            

                         

    

            

                         

    

            

                 
       
       
       
       
       

     
       
       
       
       
       
       
        
       
       

    
       

    
     

    
    
             

          
          
  
         

        