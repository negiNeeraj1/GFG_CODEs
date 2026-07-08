class Solution {
    static int evenlyDivides(int n) {
        int temp=n;
        // code here
        ArrayList<Integer> res= new ArrayList<>();
        while(n!=0){
            int r=n%10;
            res.add(r);
            n=n/10;
        }
        int count=0;
        int i=0;
        while(i<res.size()){
            if(res.get(i)!=0){
            if(temp % res.get(i)==0){
                count++;
            }
            }
            i++;
        }
        return count;
    }
}