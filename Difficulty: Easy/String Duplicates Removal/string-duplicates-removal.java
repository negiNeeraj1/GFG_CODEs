class Solution {
    String removeDuplicates(String s) {
        LinkedHashSet<Character> set=new LinkedHashSet<>();
        char ch[]=s.toCharArray();
        for(char c:ch){
            set.add(c);
        }
        StringBuilder sb=new StringBuilder("");
        for(char c:set){
            sb.append(c);
        }
        return sb.toString();
    }
}
