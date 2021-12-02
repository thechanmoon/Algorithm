class Solution(object):
    def isPalindrome(self, x):
        if x < 0 or (x % 10 == 0 and x != 0):
            return False
        # if x < 10:
        #     return True
        res = x
        tmp = 0

        while res != 0:
            tmp = tmp * 10 + res % 10
            res //= 10
        
        return tmp == x


print(Solution().isPalindrome(101));
print(Solution().isPalindrome(10));