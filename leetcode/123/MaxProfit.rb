class Integer
    N_BYTES = [42].pack('i').size
    N_BITS = N_BYTES * 16
    MAX = 2 ** (N_BITS - 2) - 1
    MIN = -MAX - 1
end

# @param {Integer[]} prices
# @return {Integer}
def max_profit(prices)
        firstBuy = Integer::MAX;;
        secondBuy = Integer::MAX;;
        firstSell = 0;
        secondSell = 0;
        for i in 0..prices.size-1
            firstBuy = [firstBuy,prices[i]].min;
            firstSell = [firstSell,prices[i] - firstBuy].max;
            secondBuy = [secondBuy,prices[i] - firstSell].min;
            secondSell = [secondSell, prices[i] - secondBuy].max;
            puts(firstBuy,firstSell,secondBuy,secondSell);
            puts("");
        end 
        secondSell;
end

puts max_profit([ 3,3,5,0,0,3,1,4]);