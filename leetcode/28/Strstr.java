public int strStr(String haystack, String needle) {
        // empty needle appears everywhere, first appears at 0 index
        if (needle.length() == 0)
            return 0;
        if (haystack.length() == 0)
            return -1;
        
        
        for (int i = 0; i < haystack.length(); i++) {
            // no enough places for needle after i
            if (i + needle.length() > haystack.length()) break;
            
            for (int j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i+j) != needle.charAt(j))
                    break;
                if (j == needle.length()-1)
                    return i;
            }
        }
        
        return -1;


        // public int strStr(String s, String t) {
        //     if (t.isEmpty()) return 0; // edge case: "",""=>0  "a",""=>0
        //     for (int i = 0; i <= s.length() - t.length(); i++) {
        //         for (int j = 0; j < t.length() && s.charAt(i + j) == t.charAt(j); j++)
        //             if (j == t.length() - 1) return i;
        //     }
        //     return -1;
        // }
}