class Palindrome{
    // public boolean isPermutationOfPalidrome(String s)
    // {
    //     int[] table = buildCharFrequencyTable(s);
    //     return checkMaxOneOdd(table);
    // }

    public boolean isPermutationOfPalidrome(String s)
    {
        int oddCount = 0;
        int length = Character.getNumericValue('z') - Character.getNumericValue('a') +1;
        int[] table = new int[length];
        for(char c: s.toCharArray())
        {
            int x = getCharNumber(c);
            if( x != -1)
            {
                table[x]++;
                if(table[x]%2==1)
                {
                    oddCount++;
                }else
                {
                    oddCount--;
                }
            }
        }         
        
        return oddCount <= 1;
    }

    public boolean isPermutationOfPalidromeBitVector(String s)
    {
        int bitVector = createBitVector(s);
        return bitVector == 0 || checkExactlyOneBitSet(bitVector);
    }

    public int createBitVector(String s)
    {
        int bitVector = 0;
        for (char c : s.toCharArray()){
            int x = getCharNumber(c);
            bitVector = toggle(bitVector, x);
        }
        return bitVector;
    }

    public int toggle(int bitVector, int index)
    {
        if (index < 0)
            return bitVector;
        int mask = 1 << index;

        if((bitVector & mask) == 0)
        {
            bitVector |= mask;
        }else
        {
            bitVector &=~mask;
        }
        return bitVector;            
    }


    public boolean checkExactlyOneBitSet(int bitVector)
    {
        return (bitVector & (bitVector -1)) == 0;
    }

    public int[] buildCharFrequencyTable(String s)
    {
        int length = Character.getNumericValue('z') - Character.getNumericValue('a') +1;
        int[] table = new int[length];
        for(char c: s.toCharArray())
        {
            int x = getCharNumber(c);
            if( x != -1)
            {
                table[x]++;
            }
        }

        // for(int n : table)
        // {
        //     System.out.println(n);
        // }
        return table;
    }

    public int getCharNumber(Character c)
    {
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int val = Character.getNumericValue(c);

        if(val >= a && val <= z)
        {
            return val -a; 
        }
        return -1;
    }

    public boolean checkMaxOneOdd(int[] table)
    {
        boolean foundOdd = false;
        for(int count : table)
        {
            if( count%2 == 1 )
            {
                if(foundOdd == false)
                {
                    foundOdd = true;
                }else{
                    return false;
                }    
            }
        }
        return true;
    } 
}


class PalindromePermutation
{
    public static void main(String[] args) {
        Palindrome pd = new Palindrome();
        System.out.println(pd.isPermutationOfPalidrome("ses ses"));
        System.out.println(pd.isPermutationOfPalidrome("test dest"));
        System.out.println(pd.isPermutationOfPalidromeBitVector("ses ses"));
        System.out.println(pd.isPermutationOfPalidromeBitVector("test dest"));
    }
}