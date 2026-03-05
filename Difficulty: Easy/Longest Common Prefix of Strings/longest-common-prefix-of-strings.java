class Solution {
    public String longestCommonPrefix(String arr[]) {
        // code here
        Arrays.sort(arr);
        
        String s1 = arr[0];
        String s2 = arr[arr.length - 1];
        int n = Math.max(s1.length(), s2.length());
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<n; i++){
            if(s1.charAt(i) == s2.charAt(i)) sb.append(s1.charAt(i));
            else break;
        }
        return sb.toString();
    }
}