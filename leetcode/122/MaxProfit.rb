def max_profit(prices)
    profit = 0
    prices.each_with_index do |v,i|
      if prices[i+1] && prices[i+1] > v
        profit += prices[i+1] - v
      end
    end
    profit
  end

  puts max_profit([7,1,5,3,6,4]);