import java.util.HashMap;

class UniqueChar{

    public static boolean isUniqueAscii(String str)
    {
        if(str.length()>128)
            return false;
        boolean[] char_set = new boolean[128];
        for(int i = 0; i < str.length(); i++)
        {
            int val = str.charAt(i);
            if(char_set[val] == true)
                return false;
            char_set[val] = true;    
        }
        return true;    
    }

    public static boolean isUniqueBit(String str)
    {
        if(str.length()>26)
            return false;

        int checker = 0;  
        for(int i = 0; i < str.length(); i++)
        {
            int val = str.charAt(i) -'a';
            if((checker & ( 1 << val)) > 0)
                return false;
            checker |= (1 << val);        
        }  

        return true;    
    }

    public static boolean isUniqueUnicode(String str)
    {
        HashMap<Integer, Boolean> hashmap = new HashMap<Integer, Boolean>();

        for(int i = 0; i < str.length(); i++)
        {
            int c = str.charAt(i);
            if(hashmap.containsKey(c))
                return false;
            hashmap.put(c,true);    
        }
        return true;    
    }

    public static boolean isUniqueSort(String str)
    {
        char[] content = str.toCharArray();
        java.util.Arrays.sort(content);

        for(int i = 1; i < content.length; i++)
        {
            if(content[i-1] == content[i])
                return false;
        }   
        return true;    
    }

    public static boolean isUnique(String str)
    {

        for(int i = 0; i < str.length()-1; i++)
        {
            for(int j = i+1; j < str.length(); j++)
            {
                if(str.charAt(i)==str.charAt(j))
                {
                    return false;
                }
            }
        }   
        return true;    
    }

    public static void main(String[] args) {
        System.out.println(isUnique("abcdefg"));
        System.out.println(isUnique("abcdefgg"));
    }
}