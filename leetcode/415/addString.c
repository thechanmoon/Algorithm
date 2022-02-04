#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <string.h>
// char *addStrings(char *num1, char *num2)
// {
//     int i = strlen(num1) - 1, j = strlen(num2) - 1, carry = 0, digit = 0;
//     int ch_num1 = 0, ch_num2 = 0, sum = 0;
//     int ret_size = (strlen(num1) > strlen(num2) ? strlen(num1) + 1 : strlen(num2) + 1) + 1; //+1 for overflow, +1 for '\0'
//     int ret_idx = ret_size - 1;
//     char *result = (char *)malloc(sizeof(char) * (ret_size));

//     result[ret_idx--] = '\0';
//     while (i >= 0 || j >= 0 || carry > 0)
//     {
//         ch_num1 = i >= 0 ? num1[i--] - '0' : 0;
//         ch_num2 = j >= 0 ? num2[j--] - '0' : 0;
//         sum = ch_num1 + ch_num2 + carry;
//         result[ret_idx--] = (sum % 10) + '0';
//         carry = (int)(sum / 10);
//         digit++;
//     }
//     if (digit > strlen(num1) && digit > strlen(num2))
//         return result;
//     else
//         return result + 1;
// }

// char *addStrings(char *num1, char *num2)
// {
//     int i = strlen(num1) - 1, j = strlen(num2) - 1, sum = 0, digit = 0;
//     int ret_size = (strlen(num1) > strlen(num2) ? strlen(num1) + 1 : strlen(num2) + 1) + 1; //+1 for overflow, +1 for '\0'
//     int ret_idx = ret_size - 1;
//     char *result = (char *)malloc(sizeof(char) * (ret_size));

//     result[ret_idx--] = '\0';
//     while (i >= 0 || j >= 0 || sum > 0)
//     {
//         sum += i >= 0 ? num1[i--] - '0' : 0;
//         sum += j >= 0 ? num2[j--] - '0' : 0;
//         printf("%d\n", (sum % 10));
//         result[ret_idx--] = (sum % 10) + '0';
//         sum = (int)(sum / 10); //carry
//         digit++;

//         printf("%s\n", result);
//         printf("===========\n");
//     }
//     if (digit > strlen(num1) && digit > strlen(num2))
//         return result;
//     else
//         return result + 1;
// }

char *addStrings(char *num1, char *num2)
{
    int i = strlen(num1) - 1, j = strlen(num2) - 1, sum = 0, digit = 0;
    int ret_len = (strlen(num1) > strlen(num2) ? strlen(num1) + 1 : strlen(num2) + 1) + 1; // +1 for carry, +1 for '\0';
    int idx = ret_len - 1;
    char *ret = (char *)malloc(sizeof(char) * ret_len);
    //char *ret = malloc(sizeof(char) * ret_len);
    ret[idx--] = '\0';

    while (i >= 0 || j >= 0 || sum > 0)
    {
        sum += i >= 0 ? (num1[i--] - '0') : 0;
        sum += j >= 0 ? (num2[j--] - '0') : 0;
        ret[idx--] = (sum % 10) + '0';
        sum = (int)(sum / 10); //carry
        //sum = sum / 10; //carry
        digit++;
    }

    if (digit > strlen(num1) && digit > strlen(num2))
        return ret;
    else
        return ret + 1;
}

int main()
{
    printf("%s\n", addStrings("11", "123"));
    printf("%s\n", addStrings("9", "99"));
    printf("%s\n", addStrings("456", "77"));
    printf("%s\n", addStrings("3876620623801494171", "6529364523802684779"));
    return 0;
}

//gcc -o addString addString.c