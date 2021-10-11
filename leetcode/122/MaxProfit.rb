# def max_profit(prices)
#     profit = 0
#     prices.each_with_index do |v,i|
#       if prices[i+1] && prices[i+1] > v
#         profit += prices[i+1] - v
#       end
#     end
#     profit
# end

# @param {Integer[]} prices
# @return {Integer}
def max_profit(prices)
    if prices.length() < 2
        return 0;
    end    
    sum = 0;    
    for i in 1..prices.length()-1
        if prices[i] > prices[i-1]
            sum += prices[i] - prices[i-1];
        end
    end      
    sum;
end

puts max_profit([7,1,5,3,6,4]);