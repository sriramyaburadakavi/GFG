class Solution:
    def majorityElement(self, arr):
        #code here
        freq = {}
        for num in arr:
            if num in freq:
                freq[num]+=1
            else:
                freq[num] = 1
        
        n = len(arr)
        for key in freq:
            if freq[key] >n//2:
                return key
        return -1