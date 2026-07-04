class Solution {
    public ArrayList<Integer> commonElements(int[] a, int[] b, int[] c) {
        // code here
        TreeSet<Integer> set1= new TreeSet<>();
        for(int num:a){
            set1.add(num);
        }
        TreeSet<Integer> set2= new TreeSet<>();
         for(int num:b){
            set2.add(num);
        }
        TreeSet<Integer> set3= new TreeSet<>();
        for(int num:c){
            set3.add(num);
        }
        ArrayList<Integer> res= new ArrayList<>();
        for(int num:set1){
            if(set1.contains(num) && set2.contains(num) && set3.contains(num)){
                res.add(num);
                
            }
        }
        
        return res;
    }
}