class Solution {
    public int nthFibonacci(int n) {
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        // code here
        int a=0;
        int b=1;
        int i=1;
        int sum=0;
        while(i<n){
            sum=a+b;
            a=b;
            b=sum;
            i++;
        }
        return sum;
    }
}