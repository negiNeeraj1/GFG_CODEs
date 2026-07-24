class Solution {
    public void swapElements(int[] arr) {
        // Code here
            for(int i=0;i<arr.length-2;i++){
                swap(arr,i,i+2);
            }
    }
    public void swap(int arr[],int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    
}