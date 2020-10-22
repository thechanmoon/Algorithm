class Permutation
{
    public static String sort(String s)
    {
        char[] content = s.toCharArray();
        java.util.Arrays.sort(content);
        return new String(content);
    }

    public static boolean isPermutation(String s, String t)
    {
        if(s.length() != t.length())
            return false;
        return sort(s).equals(sort(t));    
    }
 
    public static boolean isPermutationAscii(String s, String t)
    {
        if(s.length() != t.length())
            return false;
        int[] letters = new int[128];
        for(int i = 0; i < s.length(); i++)
        {
            letters[s.charAt(i)]++;
        } 

        for(int i = 0; i < s.length(); i++)
        {
            letters[t.charAt(i)]--;
            if(letters[t.charAt(i)]<0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPermutationAscii("ABC","BCA"));
        System.out.println(isPermutationAscii("ABC","BDA"));
    }
}