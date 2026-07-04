class Solution {
    public char nonRepeatingChar(String s) {
        // code here
        HashMap<Character,Integer> map= new HashMap<>();
        char ch[]=s.toCharArray();
        for(char c:ch){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c:ch){
            if(map.get(c)<2){
                return c;
                
            }
        }
        return '$';
    }
}
