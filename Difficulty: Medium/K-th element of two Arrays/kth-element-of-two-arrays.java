class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        int leftArr[]=new int[a.length];
        int rightArr[]=new int[b.length];
        int mergeArr[]=new int[a.length + b.length];
        for(int i=0;i<a.length;i++){
            leftArr[i]=a[i];
        }
        for(int j=0;j<b.length;j++){
            rightArr[j]=b[j];
        }
        int i=0,j=0,l=0;
        while(i<leftArr.length && j<rightArr.length){
            if(leftArr[i]<=rightArr[j]){
                mergeArr[l++]=leftArr[i++];
            }
            else{
                mergeArr[l++]=rightArr[j++];
            }
        }
        while(i<leftArr.length){
            mergeArr[l++]=leftArr[i++];
        }
        while(j<rightArr.length){
            mergeArr[l++]=rightArr[j++];
        }
        return mergeArr[k-1];
    }
    
}