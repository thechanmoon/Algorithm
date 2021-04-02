def is_palindrome(s)
    s.downcase.gsub(/[^a-z\d]/,"") == s.downcase.gsub(/[^a-z\d]/,"").reverse 
end

puts is_palindrome("A man, a plan, a canal: Panama");