# @param {Integer[]} prices
# @return {Integer}
# def max_profit(prices)
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
        
        
    #     return 0 if prices.empty?
        
    #     min_price = prices[0]
    #     max_profit = 0
    
        
    #     for i in (0..prices.length - 1)
    #         min_price = [min_price, prices[i]].min
    #         max_profit = [max_profit, prices[i] - min_price].max
    #     end
        
    #     return max_profit
        
    # end

# @param {Integer[]} prices
# @return {Integer}
# def max_profit(prices)  
#     min = prices[0];
#     max = 0;

#     for i in 1..prices.length()-1
   
#         min = prices[i] < min ? prices[i] : min;
#         max = prices[i] - min > max ? prices[i] - min : max;
        
#     end

#     max;
# end

class Integer
    N_BYTES = [42].pack('i').size
    N_BITS = N_BYTES * 16
    MAX = 2 ** (N_BITS - 2) - 1
    MIN = -MAX - 1
end

def max_profit(prices)
    
    min_price = Integer::MAX;
    max_profit = 0;
    
    for i in 0..prices.size-1
        min_price = [min_price,prices[i]].min;
        max_profit = [max_profit,prices[i] - min_price].max;
    end    
    max_profit;
end
puts max_profit([ 7, 1, 5, 3, 6, 4]);
puts max_profit([ 7, 6, 5, 4, 3, 1]);
   