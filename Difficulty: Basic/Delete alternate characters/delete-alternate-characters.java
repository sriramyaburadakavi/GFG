class Solution {
    static String delAlternate(String S) {
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<S.length();i++){
            if(i%2==0){
                sb.append(S.charAt(i));
            }
        }
        return sb.toString();
    }
}