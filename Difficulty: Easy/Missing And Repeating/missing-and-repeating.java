class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        ArrayList<Integer> res= new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i])>1){
                res.add(arr[i]);
                break;
            }
           
        }
        for(int i=1;i<=arr.length;i++){
            if(!map.containsKey(i)){
                res.add(i);
                break;
            }
        }
        return res;
    }
}
