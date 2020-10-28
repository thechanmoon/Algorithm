class OneAway{
    private boolean isOneAway(String s1, String s2)
    {
        String short_str, long_str;
        boolean bDiff = false;
        if(s1.length() < s2.length())
        {
            short_str = s1;
            long_str = s2;
        }else
        {
            short_str = s2;
            long_str = s1;            
        }
        if(long_str.length() - short_str.length() > 1)
            return false;

        for(int i = 0, j = 0; i < short_str.length(); i++, j++)
        {
            if(short_str.charAt(i) != long_str.charAt(j))
            {
                if(bDiff)
                {
                    return false;
                }
                bDiff = true;  

                if(short_str.length() != long_str.length())
                {
                    j++;
                }
            }
        }    

        return true;
    }
    public static void main(String[] args) {
        OneAway oa = new OneAway();
        System.out.println(oa.isOneAway("pal","pale"));
        System.out.println(oa.isOneAway("pale","pal"));
        System.out.println(oa.isOneAway("pale","bale"));

        System.out.println(oa.isOneAway("pal","pales"));
        System.out.println(oa.isOneAway("pale","pel"));
        System.out.println(oa.isOneAway("pale","bake"));
    }
}