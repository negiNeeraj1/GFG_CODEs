class Solution {
    public int missingNumber(int[] arr) {
        // code here
        TreeSet<Integer> set= new TreeSet<>();
        for (int num:arr){
            set.add(num);
        }
        // -3,1,2,4,7
        int res=0;
        for(int num:set){
            
            if(num>0 && !set.contains(num+1) && set.contains(1)){
               res=num+1;
               return res;
            }
        }
        return 1;
    }
}
