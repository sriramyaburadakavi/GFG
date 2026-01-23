class Solution:
    def commonElements(self, arr1, arr2, arr3):
        #Code Here
        s1=set(arr1)
        s2=set(arr2)
        s3=set(arr3)
        res=sorted(list(s1&s2&s3))
        return res