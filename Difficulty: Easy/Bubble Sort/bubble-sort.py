class Solution:
    def bubbleSort(self,arr):
        # code here
        n = len(arr)
        
        for i in range(n-1):
            is_sorted = False
            for j in range(0, n-i-1):
                if arr[j] > arr[j+1]:
                    arr[j], arr[j+1] = arr[j+1], arr[j]
                    is_sorted = True
            if not is_sorted:
                return
        return arr