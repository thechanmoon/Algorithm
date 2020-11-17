class SearchSuggestionsSystem
{
    public static void Main(string[] args)
    {
        Solution sl = new Solution();
        sl.SuggestedProducts();
    }
}
public class Solution
{
    public IList<IList<string>> SuggestedProducts(string[] products, string searchWord)
    {
        IList<IList<string>> retList = new List<IList<string>>();
        Array.Sort(products);
        for (int i = 0; i < searchWord.Length; i++)
        {
            List<string> listString = new List<string>();
            for (int j = 0; j < products.Length; j++)
            {
                if (listString.Count < 3 && i < products[j].Length
                        && (products[j].Substring(0, i + 1).Equals(searchWord.Substring(0, i + 1))))
                {
                    listString.Add(products[j]);
                }
            }
            // if (listString.Count > 0) {
            retList.Add(listString);
            // }
        }
        return retList;
    }
}

