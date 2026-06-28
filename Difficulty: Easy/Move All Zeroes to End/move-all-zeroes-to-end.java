class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        // int count=0;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]==0){
        //         count++;
        //     }
        // }
      ArrayList<Integer> res= new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                res.add(arr[i]);
            }
        }
       while(res.size()<arr.length){
           res.add(0);
       }
        for(int i=0;i<res.size();i++){
            arr[i]=res.get(i);
        }
    }
}