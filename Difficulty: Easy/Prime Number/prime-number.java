class Solution {
    static boolean isPrime(int n) {
        // code here
        boolean isPrime=false;
        int i;
        for( i=2;i<=n-1;i++){
            if(n%i==0){
                return isPrime;
            }
        }
        return n==i;
    }
}