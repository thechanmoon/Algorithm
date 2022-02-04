public class Solution {
    public string AddStrings(string num1, string num2) {
        int i = num1.Length-1, j = num2.Length-1, sum = 0;
        string ret = "";
        
        while(i > -1 || j > -1 || sum > 0)
        {
            if(i > -1)
                sum += num1[i--] - '0';
            if(j > -1)
                sum += num2[j--] - '0';
            
            ret = sum %10 + ret;
            sum = sum /10;
        }      
        return ret;        
    }
}