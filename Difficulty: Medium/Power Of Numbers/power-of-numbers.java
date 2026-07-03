class Solution {
    public int reverseExponentiation(int n) {
        // code here
        
        int rev=reverseNumber( n);
        int powerNumber=power(n,rev);
        return powerNumber;
    }
    public int reverseNumber(int n){
        int rev=0;
        while(n!=0){
            rev=rev*10;
            rev=rev+n%10;
            n=n/10;
        }
        return rev;
    
    }
    public int power(int n,int rev){
        if(rev==0){
            return 1;
        }
        else if(rev==1){
            return n;
        }
        int po=1;
       
            for(int i=1;i<=rev;i++){
                po=po*n;
            }
            return po;
    }
}
