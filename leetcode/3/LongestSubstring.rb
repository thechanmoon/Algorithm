# @param {String} s
# @return {Integer}
def length_of_longest_substring(s)
    i = 0
    j = 0
    set = Set[];
    max_length = 0
    while i < s.length
        if !(set.include?(s[i]))
            set.add?(s[i])
            i = i + 1
            max_length = [set.size(),max_length].max
        elsif
            set.delete?(s[j])
            j = j +1
        end
    end
    max_length
end
puts(length_of_longest_substring("abcabcbb"));