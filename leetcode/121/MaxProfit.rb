# @param {Integer[]} prices
# @return {Integer}
def max_profit(prices)
    #     if prices.length==0  
    #         return 0;
    #     end
        
    #     min_price=prices[0];
    #     maxprofit=0;
        
        # prices.each do |price|
        #     maxprofit =[maxprofit,price-min_price].max;
        #     min_price =  [min_price,price].min;
        # end
        
    #     0.step do |i|
    #         maxprofit =[maxprofit,prices[i]-min_price].max;
    #         min_price =  [min_price,prices[i]].min;
    #         break if i>=prices.length-1 
    #     end
        
    #     maxprofit; 
        
        
        return 0 if prices.empty?
        
        min_price = prices[0]
        max_profit = 0
    
        
        for i in (0..prices.length - 1)
            min_price = [min_price, prices[i]].min
            max_profit = [max_profit, prices[i] - min_price].max
        end
        
        return max_profit
        
    end

    puts max_profit([ 7, 1, 5, 3, 6, 4]);
    puts max_profit([ 7, 6, 5, 4, 3, 1]);
   