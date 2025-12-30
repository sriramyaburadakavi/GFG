class Solution {
    boolean isPalindrome(String s) {
        // code here
        int left = 0;
        int right = s.length() - 1;
        
        while (left < right) {
            char chLeft = s.charAt(left);
            char chRight = s.charAt(right);
            
            if(chLeft != chRight) {
                return false;
            }
            
            left++;
            right--;
        }
        
        return true;
    }
}