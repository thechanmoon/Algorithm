class ArraySTringsAreEquals {
    public static void main(String[] args) {
        Solution sl = new Solution();
        String[] word1 = {"ab","c"};
        String[] word2 = {"a","bc"};
        System.out.println(sl.arrayStringsAreEqual(word1,word2));
    }
}

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        // StringBuilder sb1 = new StringBuilder();
        // StringBuilder sb2 = new StringBuilder();
        
        // for(int i = 0; i < word1.length || i < word2.length; i++)
        // {
        //     if(i< word1.length)
        //     {
        //       sb1.append(word1[i]);  
        //     }
            
        //     if(i< word2.length)
        //     {
        //       sb2.append(word2[i]);  
        //     }
        // }
        
        // return sb1.toString().equals(sb2.toString());
        return String.join("",word1).equals(String.join("",word2));
    }
}