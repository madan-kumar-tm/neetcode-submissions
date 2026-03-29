class Solution {
    public int lengthOfLastWord(String s1) {
        String s = s1.trim();
        int len = 0;
        for(int i = s.length()-1; i >= 0; i--){
            if(s.charAt(i) != ' '){
                len++;
            }
            if(s.charAt(i) == ' '){
                break;
            }
        }
        return len;
    }
}