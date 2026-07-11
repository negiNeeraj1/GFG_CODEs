class Solution {
    public ArrayList<Integer> minAnd2ndMin(int[] arr) {
    //     // code here
    //     int min=Integer.MAX_VALUE;
    //     int secMin=Integer.MAX_VALUE;
    //     for(int i=0;i<arr.length;i++){
    //         if(arr[i]<min){
    //           secMin=min;
    //           min=arr[i];
    //         }
    //       else if(arr[i]>min && arr[i]<secMin){
    //             secMin=arr[i];
    //         }
    //     }
    // ArrayList<Integer> res=new ArrayList<>();
    // res.add(min);
    // res.add(secMin);
    // return res;
    
    
    TreeSet<Integer> set= new TreeSet<>();
    for(int num:arr){
        set.add(num);
    }
    ArrayList<Integer> res= new ArrayList<>();
    if(set.size()==1){
        res.add(-1);
    }
    else{
        res.add(set.first());
        res.add(set.higher(set.first()));
    }
    return res;
    }
}
