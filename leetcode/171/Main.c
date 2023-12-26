#include <stdio.h>
#include <string.h>

int titleToNumber(char *columnTitle)
{
    unsigned int sum = 0;
    int i = 0;
    for (i = 0; i < strlen(columnTitle); i++)
    {
        sum = sum * 26 + columnTitle[i] - 'A' + 1;
    }
    return sum;
}

int main()
{
    printf("%d\n", titleToNumber("A"));
    printf("%d\n", titleToNumber("AB"));
    printf("%d\n", titleToNumber("ZY"));
    return 0;
}
