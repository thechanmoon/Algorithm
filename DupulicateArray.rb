# def find_duplicates(nums)
#     list = [];  
#     for i in 0..nums.length
#         # index = (num > 0 ? num : -num) -1;
#         index = (nums[i].abs) -1
#         if (nums[index] < 0)
#             list.push(index+1);
#         else
#             nums[index] = -nums[index];
#         end
#         # puts "#{nums[index]}"
#         puts "#{index}"
#         # puts %{index}
#         # puts "Value of local variable is #{i}"
#     end
#     list
# end

# arr = [4,3,2,7,8,2,3,1]
# find_duplicates(arr)