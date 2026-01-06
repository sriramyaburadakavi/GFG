class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        int n=arr.length;
        ArrayList<Integer> dup=new ArrayList<>();
        TreeSet<Integer> set=new TreeSet<>();
        int rep=-1;
        for(int ele:arr){
            if(!set.add(ele)){
                rep=ele;
            }
        }
        int ex=1;
        int miss=-1;
        for(int it:set){
            if(it!=ex){
                miss=ex;
                break;
            }
            ex++;
        }
        if(miss==-1){
            miss=n;
        }
        dup.add(rep);
        dup.add(miss);
            
        return dup;
    }
}

