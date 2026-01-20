class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        ArrayList<Integer>list = new ArrayList<>();
        Set<Integer>set = new TreeSet<>();
        
        for(int i=0;i<a.length;i++){
            set.add(a[i]);
        }
        for(int j=0;j<b.length;j++){
            set.add(b[j]);
        }
        for(int x:set){
            list.add(x);
        }
        return list;
        
    }
}