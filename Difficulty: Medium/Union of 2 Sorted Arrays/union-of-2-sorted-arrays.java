class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        TreeSet<Integer> set=new TreeSet<>();
        for(int num:a){
            set.add(num);
        }
        for(int num:b){
            set.add(num);
        }
        ArrayList<Integer> res= new ArrayList<>();
        for(int num:set){
            res.add(num);
        }
        return res;
}
}
