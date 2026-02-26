class Solution {
    public static int gcd(int a, int b) {

        int min = Math.min(a,b);
        int gcd = 1;
        for(int i = min; i>=1; i--){
            if(a%i == 0 && b%i == 0){
                gcd = i;
                break;
            }
        }
        return gcd;
    }
}