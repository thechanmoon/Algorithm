# @param {String} column_title
# @return {Integer}
def title_to_number(column_title)
    sum = 0;

    # column_title.chars.each do |c|
    column_title.each_byte do |c|
        sum = sum *26 + c -65 +1
    end

    sum
end


puts title_to_number("A")
puts title_to_number("AB")
puts title_to_number("ZY")