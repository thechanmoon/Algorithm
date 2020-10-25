class URLify{
    public static void main(String[] args) {
        System.out.println(urlReplace("my tiburon special       ",18));
    }

    public static String urlReplace(String str, int len)
    {
        return urlReplace(str.toCharArray(), len);
    }

    public static String urlReplace(char[] str, int len)
    {
        int spaces = 0;
        for(int i = 0; i < len; i++)
        {
            if(str[i] == ' ') 
                spaces++;    
        }

        int index = len + spaces *2 -1;

        for(int p = len-1; p >-1; p--)
        {
            if(str[p] == ' ')
            {
                str[index--] = '0';
                str[index--] = '2';
                str[index--] = '%';
            }else{
                str[index--] = str[p];               
            }
        }
        return new String(str);
    }
}