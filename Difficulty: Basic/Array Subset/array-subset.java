class Solution {
    public boolean isSubset(int num1[], int num2[]) {
        Arrays.sort(num1);
        Arrays.sort(num2);
        int p1 = 0;
        int p2 = 0;
        int count = 0;
        while(p1 < num1.length && p2 < num2.length){
            if(num1[p1] == num2[p2]){
                count++;
                p1++;
                p2++;
            }
            else{
                p1++;
            }
        }
        if(count == num2.length){
            return true;
        }
        return false;
    }
}