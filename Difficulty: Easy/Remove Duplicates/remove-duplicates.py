class Solution:
    def removeDups(self, str):
        j=''
        a=[]
        for i in str:
            if i not in a:
                a.append(i)
        for i in a:
            j=j+i
        return j