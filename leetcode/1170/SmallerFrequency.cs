public class Solution
{
    public int[] NumSmallerByFrequency(string[] queries, string[] words)
    {
        int[] result = new int[queries.Length];


        int[] query = new int[queries.Length];
        int[] word = new int[words.Length];

        for (int i = 0; i < queries.Length; i++)
        {
            query[i] = getMinQuery(queries[i]);
        }


        for (int i = 0; i < words.Length; i++)
        {
            word[i] = getMinQuery(words[i]);
        }


        for (int i = 0; i < query.Length; i++)
        {

            int count = 0;
            for (int j = 0; j < word.Length; j++)
            {

                if (query[i] < word[j])
                {
                    count++;
                }
            }

            result[i] = count;
        }

        return result;
    }

    public int getMinQuery(String s)
    {

        char[] charAr = s.ToCharArray(0, s.Length);
        Array.Sort(charAr);

        int minLenQuery = 1;

        for (int i = 1; i < charAr.Length; i++)
        {
            if (charAr[0] == charAr[i])
            {
                minLenQuery++;
            }

        }
        return minLenQuery;
    }
}
public class Solution1
{
    public static int[] NumSmallerByFrequency(string[] queries, string[] words)
    {
        int[] result = new int[queries.Length];
        int[] arr = new int[words.Length];
        for (int i = 0; i < words.Length; i++)
            arr[i] = f(words[i]);

        for (int i = 0; i < queries.Length; i++)
        {
            int ans = f(queries[i]);
            result[i] = arr.Count(num => ans < num);
        }

        return result;

        int f(string s)
        {
            var dic = new Dictionary<char, int>();
            char smallest = 'z';
            foreach (var ch in s)
            {
                smallest = smallest > ch ? ch : smallest;
                if (dic.ContainsKey(ch))
                    dic[ch]++;
                else dic.Add(ch, 1);
            }

            return dic[smallest];
        }
    }
}