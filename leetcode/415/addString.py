class Solution(object):
    def addStrings(self, num1, num2):
        """
        :type num1: str
        :type num2: str
        :rtype: str
        """
        i = len(num1) - 1
        j = len(num2) - 1
        sum = ""
        carry = 0
        while i > -1 or j > -1 or carry > 0:

            n1 = 0
            n2 = 0
            if i > -1:

                n1 = ord(num1[i]) - 48
                i = i-1

            if j > -1:

                n2 = ord(num2[j]) - 48
                j = j-1

            sum = str((n1 + n2 + carry) % 10) + sum

            carry = int((n1 + n2 + carry)/10)

        return sum


sl = Solution()
print(sl.addStrings("11", "123"))
