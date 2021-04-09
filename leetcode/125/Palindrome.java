class Palindrome{
    public static void main(String[] args) {
        System.out.println(new Solution().isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(new Solution1().isPalindrome("A man, a plan, a canal: Panama"));
    }
}
class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        
        for(char c : s.toCharArray())
        {
            if(Character.isLetter(c) || Character.isDigit(c) )
            {
                sb.append(c);
            }
        }
        
        String str = sb.toString().toLowerCase();
        
        for(int i = 0; i < str.length()/2; i++)
        {
            if(str.charAt(str.length()-1-i) !=  str.charAt(i))
                return false;
        }
        
        return true;
    }
}

class Solution1{
    public boolean isPalindrome(String s) {

                
        s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        
        for(int i = 0; i < s.length()/2; i++)
        {
            if(s.charAt(s.length()-1-i) !=  s.charAt(i))
                return false;
        }
        
        return true;
    }
}