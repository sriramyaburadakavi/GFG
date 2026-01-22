class Solution:
    def reverseWords(self, s):
        l = s.split(".")
        l1 = l[::-1]
        ans = ""
        for i in l1:
            if i !="":
                ans +=i
                ans +="."
        return ans.strip(".")