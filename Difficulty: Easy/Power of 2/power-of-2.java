class Solution {
    public static boolean isPowerofTwo(int n) {
        // code here
        double t=n;
        for(int i=0;i<=t/2;i++){
            if(Math.pow(2,i)==t){
                return true;
            }
        }
        return false;
    }
}