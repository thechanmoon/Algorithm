/* 
Palindrome Permutation: Given a string, write a function to check if it is a permutation of a palin- drome. A palindrome is a word or phrase that is the same forwards and backwards. A permutation is a rearrangement of letters.The palindrome does not need to be limited to just dictionary words. You can ignore casing and non-letter characters.
EXAMPLE
Input: Tact Coa
Output: True (permutations: "taco cat". "atco cta". etc.)
*/

class Palindrome {
    public boolean isPermutationOfPalidrome(String s) {
        s = s.toLowerCase();
        int oddCount = 0;
        int length = Character.getNumericValue('z') - Character.getNumericValue('a') + 1;
        int[] table = new int[length];
        for (char c : s.toCharArray()) {
            int x = getCharNumber(c);
            if (x != -1) {
                table[x]++;
                if (table[x] % 2 == 1) {
                    oddCount++;
                } else {
                    oddCount--;
                }
            }
        }

        return oddCount <= 1;
    }

    public int getCharNumber(Character c) {
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int val = Character.getNumericValue(c);

        if (val >= a && val <= z) {
            return val - a;
        }
        return -1;
    }
}