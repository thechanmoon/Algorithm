class Palindrom{
    public static void main(String[] args) {
        System.out.println(new Solution().isPalindrome("A man, a plan, a canal: Panama"));
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