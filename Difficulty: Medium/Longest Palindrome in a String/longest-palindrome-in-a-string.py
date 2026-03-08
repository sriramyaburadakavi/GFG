class Solution:
    def longestPalindrome(self, s):
        # code here
        n = len(s)
        
        def expand(l, r):
            while l >= 0 and r < n and s[l] == s[r]:
                l -= 1
                r += 1
                
            return l+1, r-1
        
        ans = None
        max_len = -1
        for i in range(n):
            
            left, right = expand(i, i)
            if right-left > max_len:
                max_len = right-left
                ans = s[left:right+1]

            left, right = expand(i, i+1)
            if right-left > max_len:
                ans = s[left:right+1]
                max_len = right-left
                    
        return ans