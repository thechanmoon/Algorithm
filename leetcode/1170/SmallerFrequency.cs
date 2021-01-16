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