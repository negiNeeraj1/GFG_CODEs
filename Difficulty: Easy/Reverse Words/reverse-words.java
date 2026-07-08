class Solution {
    public String reverseWords(String s) {
        // Code here
        String words[]=s.split("\\.");
        StringBuilder res= new StringBuilder("");
        for(int i=words.length-1;i>=0;i--){
            if(words[i].equals("")){
                continue;
            }
            res.append(words[i]);
            res.append(".");
        }   
        res.deleteCharAt(res.length()-1);
        if(res.charAt(0)=='.'){
            
            res.deleteCharAt(0);
        }
        if(res.charAt(res.length()-1)=='.'){
            res.deleteCharAt(res.length()-1);
        }
        return res.toString();
    }
}
