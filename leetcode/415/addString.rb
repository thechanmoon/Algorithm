# @param {String} num1
# @param {String} num2
# @return {String}
def add_strings(num1, num2)
    i = (num1.length) -1;
    j = (num2.length) -1; 
    sum = 0;
    ret = "";
    while i > -1 || j > -1 || sum > 0 
        if i > -1
            sum = sum + num1[i].ord - '0'.ord;
            i = i -1;
        end
        
        if j > -1
            sum = sum + num2[j].ord - '0'.ord;
            j = j -1;
        end
        ret = (sum%10).to_s + ret;
        sum = (sum/10);
    end
    ret;
end

puts(add_strings("11","123"));
puts(add_strings("9", "99"));
puts(add_strings("456", "77"));
puts(add_strings("3876620623801494171", "6529364523802684779"));