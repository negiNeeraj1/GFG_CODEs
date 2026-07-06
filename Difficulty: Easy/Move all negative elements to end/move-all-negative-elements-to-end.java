class Solution {
    public void segregateElements(int[] arr) {
        // code here
        ArrayList<Integer>res1=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0){
                res1.add(arr[i]);
            }
        }
         for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                res1.add(arr[i]);
            }
        }
        
        for(int i=0;i<arr.length;i++){
            arr[i]=res1.get(i);
        }
       
    }
}