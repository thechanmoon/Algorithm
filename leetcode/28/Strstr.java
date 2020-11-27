public int strStr(String haystack, String needle) {
    int start = 0;
    // char[] arrHaystack = haystack.toCharArray();
    // char[] arrNeedle = haystack.toCharArray();
    
    for(int i = 0; i < haystack.length(); i++)
    {
        for(int j = 0; j < needle.length(); j++)
        {
            if(haystack.charAt(i) == needle.charAt(j))
            {
                start = i;
                int count = 0;
                while(i + count < haystack.length() && j+count < needle.length() && haystack.charAt(i+count) == needle.charAt(j+count))
                {
                    if(count == needle.length())
                        return i;
                    count++;
                }
            }
        }
    }
    return -1;
}